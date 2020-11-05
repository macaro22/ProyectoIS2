package proyecto.is2.controller;

import proyecto.is2.model.Ajedrez;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
/**
 *
 * @author carlosguardiola
 */
public class GestorAjedrez {
    private XStream xstream = null;
    private Ajedrez ajedrez;

    public static final SimpleDateFormat FORMAT_DATE = new SimpleDateFormat("dd-MM-yyyy");
    public static final SimpleDateFormat FORMAT_HORA = new SimpleDateFormat("HH:mm", new Locale("es", "ES"));
    public static final SimpleDateFormat FORMAT_DATE_HORA = new SimpleDateFormat("EEEE dd 'de' MMMM HH:mm", new Locale("es", "ES"));

    public GestorAjedrez() throws Exception {
        //Carga datos

        xstream = new XStream(new DomDriver());

        try {
             FileInputStream file_input_xml = new FileInputStream(new File("src/Ajedrez.xml"));
             ajedrez = (Ajedrez) xstream.fromXML(file_input_xml);
            if (ajedrez == null) {
                throw new Exception("Excepción no se encuentra Ajedrez");
            }
        } catch (FileNotFoundException e) {
            ajedrez = new Ajedrez();
            ajedrez.cargarDatos();
            guardarXML();
        } catch (IOException e) {
            throw new Exception("IOExcepción al cargar los datos" + e.getMessage());
        } catch (Exception e) {
            throw new Exception("Excepción al cargar los datos" + e.getMessage());
        }
    }

    public void salir() {
        guardarXML();
    }

    private void guardarXML() {
        String xml = xstream.toXML(ajedrez);
        try {
            FileWriter file_output_xml = new FileWriter(new File("src/Ajedrezl.xml"));
            file_output_xml.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            file_output_xml.write(xml);
            file_output_xml.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
