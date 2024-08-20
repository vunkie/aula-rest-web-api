package dio.aula_rest_web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.aula_rest_web_api.model.Usuario;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        if(usuario.getId() == null)
            System.out.println("Usuário salvo com sucesso!");
        else
            System.out.println("Usuário atualizado com sucesso!");
    }

    public void deleteById(Integer id){
        System.out.println("Usuário removido com sucesso!");
        System.out.println("Id: " + id);
    }

    public List<Usuario> findAll(){
        System.out.println("Listando todos os usuários");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("João", "123"));
        usuarios.add(new Usuario("Maria", "456"));
        usuarios.add(new Usuario("Jose", "789"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("Buscando usuário por id: %d", id));
        return new Usuario("João", "123");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("Buscando usuário por username: %s", username));
        return new Usuario("João", "123");
    }

}
