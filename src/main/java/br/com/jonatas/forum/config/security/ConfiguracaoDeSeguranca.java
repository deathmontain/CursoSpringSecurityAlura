package br.com.jonatas.forum.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class ConfiguracaoDeSeguranca extends WebSecurityConfigurerAdapter {

    //Configuração de autenticação
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    }

    //Configuração de Autorização
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(HttpMethod.GET,"/topicos").permitAll()
                .antMatchers(HttpMethod.GET, "/topicos/*").permitAll();
    }

    //Configuração de recursos estáticos(js, css, imagens, etc.)
    @Override
    public void configure(WebSecurity web) throws Exception {
    }
}