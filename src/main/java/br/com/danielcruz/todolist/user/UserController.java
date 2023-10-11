package br.com.danielcruz.todolist.user;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
 * Modificador
 * puclic
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
    /*
     * Tipos
     * String(Texto)
     * Integer(Int) numeros inteiros
     * Double(double) numeros decimais
     * Float(float) numeros decimais menores
     * Char (A C)
     * Date (data)
     * Void (Sem retorno)
     */
    //Vem de dentro do body da requisicao
    @PostMapping("/")
    public Void create(@RequestBody UserModel userModel){
        System.out.println(userModel.getUsername());
        return null;
    }
}
