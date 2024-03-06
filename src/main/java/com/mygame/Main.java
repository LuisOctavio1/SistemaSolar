package com.mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Sphere;
import com.jme3.texture.Texture;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    public Spatial spatial_var = null;
    public Spatial tierra_spatial = null;
    public Spatial tierra_spatial2 = null;
    public Spatial tierra_spatial3 = null;
    public Spatial tierra_spatial4 = null;
    public Spatial tierra_spatial5 = null;
    public Spatial sol_spatial = null;
    
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        //cam.setLocation(new Vector3f(50, 50, 50)); // Mueve la cámara a la posición (0, 10, 0), es decir, 10 unidades sobre el origen
        //cam.lookAt(Vector3f.ZERO, Vector3f.UNIT_Z);
        Node padre_cubo = new Node("padre_cubo");
        Node padre_tierra = new Node("padre_tierra");
        Node padre_tierra2 = new Node("padre_tierra2");
        Node padre_tierra3 = new Node("padre_tierra3");
        Node padre_tierra4 = new Node("padre_tierra4");
        Node padre_tierra5 = new Node("padre_tierra5");
        Sphere  b = new Sphere (32, 32, 1f);
        Geometry tierra_geom = new Geometry("tierra_geom", b);
        Geometry luna_geom = new Geometry("luna_geom",b);
        Geometry tierra_geom2 = new Geometry("tierra_geom2", b);
        Geometry tierra_geom3 = new Geometry("tierra_geom3", b);
        Geometry tierra_geom4 = new Geometry("tierra_geom4", b);
        Geometry tierra_geom5 = new Geometry("tierra_geom5", b);
        Geometry sol_geom = new Geometry("sol_geom",b);
        
        

        Material mat_blue = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat_blue.setColor("Color", ColorRGBA.Blue);
        Material mat_gray = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat_gray.setColor("Color", ColorRGBA.Gray);
        
        Material mat_yellow = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat_yellow.setColor("Color",  new ColorRGBA(1f, 1f, 1f, 0.5f));
        Texture texturaTierra = assetManager.loadTexture("Textures/tierra.jpg");
        mat_yellow.setTexture("ColorMap",texturaTierra);
        
        Material mat_sol = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat_sol.setColor("Color",  new ColorRGBA(1f, 1f, 1f, 0.5f));
        Texture texturaSol = assetManager.loadTexture("Textures/gorgeGod.jpg");
        mat_sol.setTexture("ColorMap",texturaSol);
        
        
        
        tierra_geom.setMaterial(mat_yellow);
        luna_geom.setMaterial(mat_gray);
        
        tierra_geom2.setMaterial(mat_blue);
        
        tierra_geom3.setMaterial(mat_blue);
        
        tierra_geom4.setMaterial(mat_blue);
        
        tierra_geom5.setMaterial(mat_blue);
        
        sol_geom.setMaterial(mat_sol);
        
        padre_tierra.attachChild(tierra_geom);
        //padre_luna.attachChild(luna_geom);
        padre_cubo.attachChild(sol_geom);
        
        padre_tierra2.attachChild(tierra_geom2);
        padre_tierra3.attachChild(tierra_geom3);
        padre_tierra4.attachChild(tierra_geom4);
        padre_tierra5.attachChild(tierra_geom5);
        
        
        //luna_geom.move(15, 1, 0);
        luna_geom.scale(0.5f);
        
        tierra_geom.move(-4,0,18);
        
        
        
        tierra_geom2.move(60,1,0);
        tierra_geom3.move(38,0,6);
        tierra_geom4.move(-25,0,4);
        tierra_geom5.move(4,0,5);
   
               
        rootNode.attachChild(padre_cubo);
        padre_cubo.attachChild(padre_tierra);
        padre_tierra.attachChild(padre_tierra2);
        padre_cubo.attachChild(padre_tierra3);
        padre_cubo.attachChild(padre_tierra4);
        padre_tierra4.attachChild(padre_tierra5);
        //padre_tierra.attachChild(padre_luna);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
        if(spatial_var == null){
            spatial_var = rootNode.getChild("padre_cubo");
            tierra_spatial = rootNode.getChild("tierra_geom");
            tierra_spatial2 = rootNode.getChild("padre_tierra2");
            tierra_spatial3 = rootNode.getChild("padre_tierra3");
            tierra_spatial4 = rootNode.getChild("padre_tierra4");
            tierra_spatial5 = rootNode.getChild("padre_tierra5");
            sol_spatial = rootNode.getChild("sol_geom");
          
        }
        
        spatial_var.rotate(0, tpf/4, 0);
        tierra_spatial.rotate(0, (tpf*2), 0);
        tierra_spatial2.rotate(0, (tpf*2), 0);
        tierra_spatial3.rotate(0, (tpf*2), 0);
        tierra_spatial4.rotate(0, (tpf*2), 0);
        tierra_spatial5.rotate(0, (tpf*2), 0);
        sol_spatial.rotate(0,tpf,0);
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
