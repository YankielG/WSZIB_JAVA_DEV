package pl.edu.wszib.jwd.java_dev.ustawienia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class LogowanieUstawienia extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//             .passwordEncoder(bCryptPasswordEncoder);
//    }

//    @Autowired
//    DataSource dataSource;

//    @Override protected void configure(AuthenticationManagerBuilder auth)
//            throws Exception {
//        auth
//                .jdbcAuthentication()
//                .dataSource(dataSource)
//                .usersByUsernameQuery(
//                        "select username, password, true " +
//                                "from Spitter where username=?")
//                .authoritiesByUsernameQuery(
//                        "select username, 'ROLE_USER' from Spitter where username=?")
//                .passwordEncoder(new StandardPasswordEncoder("53Kr3t"));
//    }


    @Bean
    public UserDetailsService uzytkownikustawienia(){

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("gosc")
                .password("g1")
                .roles("GOSC")
                .build();
        UserDetails manager = User.withDefaultPasswordEncoder()
                .username("szef")
                .password("s1")
                .roles("MANAGER")
                .build();
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("a1")
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        String loginPage = "/login";
        String logoutPage = "/";

        http.
                authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(loginPage).permitAll()
                .antMatchers("/rejestracja").permitAll()
                .antMatchers("/przypomnijhaslo").permitAll()
                .antMatchers("/opcje/opcjeinfo").hasAnyAuthority("MANAGER")
                .antMatchers("opcje/opcjeprofil").hasAnyAuthority("ADMIN")
////                .anyRequest().hasRole("UZYTKOWNIK")
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
//                .logout() .permitAll();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/pliki/**", "/templates/**","/**");
    }

}

