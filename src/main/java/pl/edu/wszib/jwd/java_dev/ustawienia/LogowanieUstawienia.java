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
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class LogowanieUstawienia extends WebSecurityConfigurerAdapter {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//             .passwordEncoder(bCryptPasswordEncoder);
//    }

    @Bean
    public UserDetailsService uzytkownikustawienia(){

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("uz")
                .password("uz1")
                .roles("uz")
                .build();
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin1")
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        String loginPage = "/login";
//        String loginPage = "/start";
        String logoutPage = "/logout";
//        String logoutPage = "/wyloguj";

//        http.
//                authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers(loginPage).permitAll()
//                .antMatchers("/rejestracja").permitAll()
//                .antMatchers("/opcje/opcjeinfo").hasAnyAuthority("ADMIN")
//                .antMatchers("opcje/opcjeprofil").hasAnyAuthority("ADMIN")
////                .anyRequest().hasRole("UZYTKOWNIK")
//                .anyRequest()
//                .authenticated()
//                .and().csrf().disable()
//                .formLogin()
//                .loginPage(loginPage)
//                .loginPage("/")
//                .failureUrl("/login?error=true")
//                .defaultSuccessUrl("/index")
//                .usernameParameter("uzytkownik")
//                .passwordParameter("haslo")
//                .and().logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher(logoutPage))
//                .logoutSuccessUrl(loginPage).and().exceptionHandling();

        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().hasRole("ADMIN")
                .and()
                .formLogin() .permitAll()
                .and()
                .logout() .permitAll();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/templates/**");
    }

}

