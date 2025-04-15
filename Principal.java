import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        ArrayList<ProgramaTV> programas = new ArrayList<ProgramaTv>();

        ProgramaTV p = new ProgramaTV(001, "O outro lado do paraiso","Novela");
        p.diretor = new Pessoa("Diretor 1", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
		programas.add(p);
		
		p = new ProgramaTV(002,"Orgulho e Paixão","Novela");
		p.diretor = new Pessoa("Diretor 2", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 3", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 4", "Brasileiro"));
		programas.add(p);
		
		p = new ProgramaTV(003,"Marley e eu","Filme");
		p.diretor = new Pessoa("Diretor 3", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 5", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 6", "Brasileiro"));
		programas.add(p);
		
		p = new ProgramaTV(004,"Show Ivete Sangalo","Show");
		p.diretor = new Pessoa("Diretor 4", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 7", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 8", "Brasileiro"));
		programas.add(p);
		
					
		for (int i=0;i<programas.size();i++) {
			System.out.println(programas.get(i));
		}
    }
}