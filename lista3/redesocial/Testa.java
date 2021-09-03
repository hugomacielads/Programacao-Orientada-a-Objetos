package lista3.redesocial;

public class Testa {
    
    public static void main(String args[]){

        Usuario usr1 = new Usuario("fulano@email.com", "123");

        Usuario usr2 = new Usuario("beltrano@email.com", "321");
    
        Usuario usr3 = new Usuario("ciclano@email.com", "444");
    
        RedeSocial rs = new RedeSocial(1, "Instagram", "www.instagram");

        RedeSocial rs2 = new RedeSocial(2, "Facebook", "www.facebook");

        rs2.addUsuario(usr1);
        rs2.addUsuario(usr2);
        rs2.addUsuario(usr3);

        System.out.println(rs2.toString());

        rs.addUsuario(usr1); // adiciona usuáro na rede social
        rs.addUsuario(usr2); // adiciona usuáro na rede social
        rs.addUsuario(usr3); // adiciona usuáro na rede social

        System.out.println(rs.toString());
    }
}