public class ReprodutorMusical {
    
    private String estado;

    private String [] musicas = {
        "1 - SKINNY", 
        "2 - LUNCH", 
        "3 - CHIHIRRO", 
        "4 - BIRDS  OF A FEATHER", 
        "5 - WILDFLOWER", 
        "6 - THE GREATEST", 
        "7 - L'AMOUR DE MA VIE", 
        "8 - THE DINNER", 
        "9 - BITTERSUITE",
        "10 - BLUE"
    };
    
    void tocar(){
        for ( String music:musicas){
            System.out.println(music + "/n");
        }
    }
}
