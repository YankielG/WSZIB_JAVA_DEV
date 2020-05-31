package pl.edu.wszib.jwd.java_dev.ustawienia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class LogowanieUstawienia extends WebSecurityConfigurerAdapter {

//    xxxxx szyfrowania xxxxx

//        @Bean
//        public static PasswordEncoder passwordEncoder() {
//            return NoOpPasswordEncoder.getInstance();
//        }



    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    //    xxxxx uzytkownicy xxxxx

    @Autowired
    DataSource dataSource;

    @Override protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth
                .jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery(
                        "select uzytkownik, haslo, true " +
                                "from Profil where uzytkownik=?")
                .authoritiesByUsernameQuery(
                        "select uzytkownik, uzytkownik_typ from Profil where uzytkownik=?")
////                .passwordEncoder(new StandardPasswordEncoder("53Kr3t"));
                    .passwordEncoder(bCryptPasswordEncoder);

    }



//@Override protected void configure(AuthenticationManagerBuilder auth)
//        throws Exception {
//    auth.
//            inMemoryAuthentication()
//            .withUser("gosc").password("{noop}g").roles("USER").and()
//            .withUser("admin").password("{noop}a").roles("USER", "MANAGER" ,"ADMIN").and()
//            .withUser("szef").password("{noop}s").roles("USER", "MANAGER");
//}


//    @Bean
//    public UserDetailsService uzytkownikustawienia(){
//
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("gosc")
//                .password("g")
//                .roles("GOSC")
//                .build();
//        UserDetails manager = User.withDefaultPasswordEncoder()
//                .username("szef")
//                .password("s")
//                .roles("MANAGER")
//                .build();
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("a")
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(user, manager, admin);
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        String loginPage = "/login";
        String logoutPage = "/";

        http.
                authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(loginPage).permitAll()
                .antMatchers("/rejestracja").permitAll()
                .antMatchers("/rejestracja/zapisz").permitAll()
                .antMatchers("/rejestracja/zapisz").permitAll()
                .antMatchers("/przypomnijhaslo").permitAll()
                .antMatchers("/przypomnijblad").permitAll()
                .antMatchers("/przypomnijsukces").permitAll()
//                .antMatchers("/opcje/opcjeinfo/**").hasAnyAuthority("MANAGER", "ADMIN")
//                .antMatchers("/opcje.opcjeprofil/**").hasAuthority("ADMIN")
////                .anyRequest().hasRole("USER")
                .anyRequest()
                .authenticated()
                .and().csrf().disable()
                .formLogin()
                .loginPage(loginPage)
                .loginPage("/")
                .failureUrl("/login?error=true")
                .defaultSuccessUrl("/index")
                .usernameParameter("user_name")
                .passwordParameter("password")
                .and().logout()
                .logoutRequestMatcher(new AntPathRequestMatcher(logoutPage))
                .logoutSuccessUrl(loginPage).and().exceptionHandling();

//        http.authorizeRequests()
//                .antMatchers("/").permitAll()
//                .anyRequest().hasRole("ADMIN")
//                .and()
//                .formLogin() .permitAll()
//                .and()
//                .logout() .permitAll()
//                .and()
//                .rememberMe()
//                .tokenValiditySeconds(60)
//                .key("spittrKey");

    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/pliki/**", "/templates/**");
    }

}


