package org.example.textures;

public class ModelTexture {

    private int textureID;

    private float shineDamper = 1;
    private float reflectivity = 1;
    private boolean hasTransparency = false;
    private boolean useFakeLighting = false;
    
    private int numberOfRows = 1;

    public boolean isUseFakeLighting(){
        return useFakeLighting;
    }

    public void setUseFakeLighting(boolean useFakeLighting) {
        this.useFakeLighting = useFakeLighting;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public ModelTexture(int id){
        this.textureID = id;
    }

    public int getTextureID() {
        return this.textureID;
    }

    public boolean isHasTransparency() {
        return this.hasTransparency;
    }

    public void setHasTransparency(boolean hasTransparency) {
        this.hasTransparency = hasTransparency;
    }

    public void setTextureID(int textureID) {
        this.textureID = textureID;
    }

    public float getShineDamper() {
        return this.shineDamper;
    }
    public void setShineDamper(float shineDamper) {
        this.shineDamper = shineDamper;
    }
    public float getReflectivity() {
        return this.reflectivity;
    }
    public void setReflectivity(float reflectivity) {
        this.reflectivity = reflectivity;
    }
}
