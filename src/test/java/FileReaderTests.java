import filemanager.FileReader;
import filemanager.Reader;
import org.junit.jupiter.api.Test;
import org.semanticweb.owlapi.model.OWLOntology;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTests {

    @Test
    public void readFileTest(){
        FileReader fileReader = new Reader();
        try {
            OWLOntology ontology = fileReader.read("src/main/resources/PaNET.owl");
            System.out.println(ontology);
            assertNotNull(ontology);
        }catch(Exception e){
            fail();
        }
    }
}