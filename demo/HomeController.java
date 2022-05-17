package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class HomeController {
       
	@GetMapping("/")
	public String home() {
          return "index";
	}


   @GetMapping("/signin")
    public String login() {
      return "signin";
   }
      @GetMapping("/signup")
      public String login1() {
        return "signup";
      }
      @GetMapping("/cadastrado")
      public String cadastrado() {
        return "cadastrado";
      }
      @GetMapping("/quemsou")
      public String quemsou() {
        return "quemsou";
      }
 
   @PostMapping("/dashboard")
   public String dashboard(HttpServletRequest request, Model model) {
        String usuario = request.getParameter("Usuario");
        String senha = request.getParameter("Senha");

        System.out.println("Usuário: " + usuario);
        System.out.println("senha...: " + senha);
        
        if ( senha.equals("12345678") ) {
	   model.addAttribute("nome", usuario );
	   model.addAttribute("descricao", "NADA");
	   return "dashboard";
        }
        else {
        	model.addAttribute("mensagem","Senha invalida");
        	return "erro";
        }
        
	   
 
   }
   
}

