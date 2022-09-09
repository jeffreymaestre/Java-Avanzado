package Iterator;

import java.util.ArrayList;

public interface UsuarioIterator {
    //Hay mas usuarios en el iterator?
    boolean hayMas();
    //Reinicia el contador  (el iterator)
    void reinicia();
    //Obtiene el siguiente
    Usuario siguiente();
}
