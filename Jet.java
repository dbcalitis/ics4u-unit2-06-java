/*
* Jet Class
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-23
*/

/**
 * Jet class.
 */
class Jet extends Airplane {
    /**
     * Multiplier variable.
     */
    private static int MULTIPLIER = 2;

    /**
     * The getSpeed function.
     *
     * <p>
     * Gets the speed.
     * </p>
     *
     * @return speed - the speed of the Airplane.
     */
    public int getSpeed() {
        return super.getSpeed();
    }

    /**
     * The setSpeed function.
     *
     * <p>
     * Sets the speed.
     * </p>
     *
     * @param speed - the speed of the Airplane.
     */
    public void setSpeed(int speed) {
        super.setSpeed(speed * this.MULTIPLIER);
    }

    /**
     * The accelerate function.
     *
     * <p>
     * Accelerates the jet, which increases the speed.
     * </p>
     */
    public void accelerate() {
        super.setSpeed(super.getSpeed() * 2);
    }
}
