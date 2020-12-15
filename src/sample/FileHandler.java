package sample;
package sample.util;

import parser.ParserException;
import parser.XmlJsonParser;
import sample.KundeController;
import sample.OpgaveController;
import sample.TeamMedlemController;
import sample.metoder.Opgaver;

import java.io.*;

public class FileHandler

{

    // Denne metode bruges til at gemme vores opgaveliste til en XML FIL, som så loades på websiden.
    public static void saveXML(OpgaveController opgaven)
    {
        XmlJsonParser theParser = new XmlJsonParser();
        try
        {
            theParser.toXml(opgaven, "opgaveliste.xml");
            System.out.println(">From FileHandler.java<Parse toXml finished>");
        }
        catch (ParserException e)
        {
            e.printStackTrace();
        }
    }

    // Metode der gemmer alting
    public static void save(Object list) throws IOException
    {
        String filename = "";
        if (list instanceof OpgaveController)
            filename = "opgaveliste.bin";
        if (list instanceof KundeController)
            filename = "kundelist.bin";
        if (list instanceof TeamMedlemController)
            filename = "teammedlemliste.bin";

        File file = new File(filename);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(list);
        out.close();
        System.out.println("Gem fil til:  " + file.getAbsolutePath());
    }

    // Metoder der loader de forskellige filer vi har gemt
    public static OpgaveController projectListLoad() throws IOException, ClassNotFoundException
    {
        File file = new File("opgaveliste.bin");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fis);

        OpgaveController opgaverliste = (OpgaveController) in.readObject();
        in.close();
        System.out.println("Opgave list hentet");
        return opgaverliste;
    }

    public static TeamMedlemController employeeListLoad() throws IOException, ClassNotFoundException
    {
        File file = new File("teammedlemliste.bin");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fis);

        TeamMedlemController teammedlemliste = (TeamMedlemController)  in.readObject();
        in.close();
        System.out.println("Teammedlem listen");
        return teammedlemliste;
    }

    public static KundeController customerListLoad() throws IOException, ClassNotFoundException
    {
        File file = new File("kundeliste.bin");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fis);

        KundeController kundelisten = (KundeController)  in.readObject();
        in.close();
        System.out.println("Kundelisten er nu hentet");
        return kundelisten;
    }
}