import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ClasePadre {

    public static void main(String[] args) {

        Process proceso;

        File directorio = new File("C:\\Users\\a21dominicohl\\IdeaProjects\\Actividad1.6PSP\\target\\classes");

        ProcessBuilder pb = new ProcessBuilder("java", "ProgramaSuma");

        pb.directory(directorio);

        try {

            proceso = pb.start();
        } catch (IOException e) {

            throw new RuntimeException(e);
        }

        OutputStream os = proceso.getOutputStream();

        try {
            os.write("7\n".getBytes());

            os.write("5\n".getBytes());

            os.flush();

        } catch (IOException e) {

            throw new RuntimeException(e);
        }

        InputStream is = proceso.getInputStream();

        int resultado;

        try {

            while ((resultado = is.read()) != -1)

                System.out.print((char)resultado);

            is.close();
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }
}
