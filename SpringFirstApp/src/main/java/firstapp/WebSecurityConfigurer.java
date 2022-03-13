package firstapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("test").password("test123").roles("USER").and().withUser("TRT").password("FDFDF").roles("USER");
	}

	/*
	 * @Override public AuthenticationManager authenticationManagerBean() throws
	 * Exception { // TODO Auto-generated method stub return
	 * super.authenticationManagerBean(); }
	 */
	@Bean(name = BeanIds.USER_DETAILS_SERVICE)
	@Override
	public UserDetailsService userDetailsServiceBean() throws Exception {
		// TODO Auto-generated method stub
		return super.userDetailsServiceBean();
	}
	
	
	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
	   @Override
	   public AuthenticationManager authenticationManagerBean() throws Exception {
	       return super.authenticationManagerBean();
	   }
	
	

}
