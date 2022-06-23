package persistencia;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class PersistenciaXML implements IPersistencia {
    private XMLEncoder xmlEncoder;
    private XMLDecoder xmlDecoder;
    private FileOutputStream fileoutput;
    private FileInputStream fileinput;


    @Override
    public void abrirInput(String nombre) throws IOException
    {
        fileinput = new FileInputStream(nombre);
        xmlDecoder = new XMLDecoder(fileinput);

    }

    @Override
    public void abrirOutput(String nombre) throws IOException
    {
        fileoutput = new FileOutputStream(nombre);
        xmlEncoder = new XMLEncoder(fileoutput);


    }

    @Override
    public void cerrarOutput() throws IOException
    {
        this.xmlEncoder.close();
    }

    @Override
    public void cerrarInput() throws IOException
    {
        this.xmlDecoder.close();
    }

    @Override
    public void escribir(Object objeto) throws IOException
    {
        xmlEncoder.writeObject(objeto);

    }

    @Override
    public Object leer() throws IOException, ClassNotFoundException
    {
        Object objeto = null;
        if (xmlDecoder != null)
            objeto = (Serializable) xmlDecoder.readObject(); //PUEDE HABER UN ERROR ACA

        return objeto;
    }
    
}
