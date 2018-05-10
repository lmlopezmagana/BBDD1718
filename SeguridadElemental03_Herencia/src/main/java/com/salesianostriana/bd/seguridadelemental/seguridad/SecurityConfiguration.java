package com.salesianostriana.bd.seguridadelemental.seguridad;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.salesianostriana.bd.seguridadelemental.model.Administrador;
import com.salesianostriana.bd.seguridadelemental.model.UsuarioBasico;

@Configuration
public class SecurityConfiguration {
	
	
	@Bean
	public FilterRegistrationBean<SecurityFilter> filterSecurityBean() {
		FilterRegistrationBean<SecurityFilter> registro = new FilterRegistrationBean<>();
		registro.setFilter(securityFilter());
		registro.addUrlPatterns("/app/*");
		registro.setName("securityFilter");
		return registro;
	}
	
	
	@Bean
	public FilterRegistrationBean<SecurityAdminFilter> adminFilterSecurityBean() {
		FilterRegistrationBean<SecurityAdminFilter> registro = new FilterRegistrationBean<>();
		registro.setFilter(securityAdminFilter());
		registro.addUrlPatterns("/admin/*");
		registro.setName("securityAdminFilter");
		return registro;
	}
	
	
	
	@Bean("securityFilter")
	public SecurityFilter securityFilter() {
		return new SecurityFilter();
	}
	
	class SecurityFilter implements Filter  {

		@Override
		public void init(FilterConfig filterConfig) throws ServletException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
				throws IOException, ServletException {
			HttpServletRequest request = (HttpServletRequest) req;
			HttpServletResponse response = (HttpServletResponse) resp;
			HttpSession session = request.getSession();

			if (session.getAttribute("usuarioActual") == null) {
				response.sendRedirect("/");
				return;
				
			// Modificamos esto con respecto al ejemplo SeguridadElemental02, para que
			// un Administrador no pueda realizar las mismas operaciones que un usuario normal.
			} else if (session.getAttribute("usuarioActual") instanceof Administrador) {
					response.sendRedirect("/admin/");
					return;
			} else
				chain.doFilter(req, resp);
			
		}
		@Override
		public void destroy() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	@Bean("securityAdminFilter")
	public SecurityAdminFilter securityAdminFilter() {
		return new SecurityAdminFilter();
	}
	
	class SecurityAdminFilter implements Filter {

		@Override
		public void init(FilterConfig filterConfig) throws ServletException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
				throws IOException, ServletException {
			HttpServletRequest request = (HttpServletRequest) req;
			HttpServletResponse response = (HttpServletResponse) resp;
			HttpSession session = request.getSession();

			if (session.getAttribute("usuarioActual") == null) {
				response.sendRedirect("/");
				return;
			} else if (session.getAttribute("usuarioActual") instanceof UsuarioBasico) {
				response.sendRedirect("/app/");
				return;
			} else
				chain.doFilter(req, resp);
		}

		@Override
		public void destroy() {
			// TODO Auto-generated method stub
			
		}
		
	}

}
