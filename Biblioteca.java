import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<Livro>();

//Metodos

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    public void listarLivros(){
        int c = 1;
        for (Livro livro : livros){
            System.out.println(c + "-" + livro.getTitulo());
            c++;
        }

    }
    public void removerLivro(String titulo){
        Livro encontrado = null;
        for(Livro livro:livros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                encontrado = livro;
                break;
            }
        }
        if (encontrado!=null){
            livros.remove(encontrado);
            System.out.println("Livro removido!");
        }
        else {
            System.out.println("Livro não encontrado");
        }
    }
    public void buscarLivro(String titulo){
        boolean encontrado = false;
        for(Livro livro:livros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                livro.mostrarDetalhes();
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Livro não encontrado!");
        }
    }

}
