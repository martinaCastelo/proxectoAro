package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author MartinaCastelo
 */
public class Aro {
    
    /**
     * Declaración de constantes para a clase Aro.
     */
    public static final double MINIMO = 0.0;
    /**
     * Declaración de constantes para a clase Aro.
     */
    private static final double LIMITERADIO = MINIMO;
    
    /**
     * Declaración de variables para a clase Aro.
     */
    private int coordenadaX;
    private int coordenadaY;
    private double radio;
    
    /**
     * Getter para coordenadaX. Obtén o valor de coordenadaX.
     * @return Valor de coordenadaX (int).
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Setter para coordenadaX. Establece o valor de coordenadaX.
     * @param coordenadaX valor a establecer de coordenadaX.
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Método get para coordenadaY. Obtén o valor de coordenadaY.
     * @return Valor de coordenadaY (int).
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY valor a establecer de coordenadaY.
     * Método set para coordenadaY. Establece o valor de coordenadaY.
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Método get para radio. Obtén o valor de radio.
     * @return Valor de radio (double).
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Método set para radio. Establece o valor de radio.
     * @param radio valor a establecer de radio.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     *Constructor por defecto da clase Aro.
     */
    public Aro() {
    }

    /**
     * Constructor parametrizado de Aro.
     * @param valorX parámetro da coordenadaX para o constructor de Aro.
     * @param valorY parámetro da coordenadaY para o constructor de Aro.
     * @param valorRadio parámetro de radio para o constructor de Aro.
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * Método que obtén o diámetro do aro.
     * @return Diámetro (double) a partir de get(Radio)*2.
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     *  Método que obtén a circunferencia do aro. 
     * @return Circunferencia (double). 
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Método que obtén a superficie do aro. 
     * @return Superficie (double).
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * Método toString(). Obtén a cadea de saída.
     * @return String combinado cos valores obtidos polos getter e setter de coordenadaX, coordenadaY e radio.
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Método parametrizado trasladarCentro
     * @param trasladarX parámetro para o método trasladarCentro()
     * @param trasladarY parámetro para o método trasladarCentro()
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}