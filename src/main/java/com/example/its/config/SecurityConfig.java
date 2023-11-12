package com.example.its.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import lombok.RequiredArgsConstructor;

/**
 * SpringSecurityの設定クラス
 * @author atsu_yyy
 *
 */
@EnableWebSecurity
@RequiredArgsConstructor // 初期化されていないフィールドを引数にとるコンストラクターを自動生成する
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	private final UserDetailsService userDetailsService; // CustomUserDetailsServiceがインジェクションされる

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.mvcMatchers("/login/**/").permitAll()
				.anyRequest().authenticated()
				.and()
				.formLogin()
				// .usernameParameter("AAA") この設定により、パラメーターのname属性のデフォルトの値を変更できる
				// .passwordParameter("BBB")
				.loginPage("/login");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}

}
