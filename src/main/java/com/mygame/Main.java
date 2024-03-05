package com.mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    public Spatial spatial_var = null;
    public Spatial tierra_spatial = null;
    public Spatial luna_spatial = null;
    public Spatial tierra_spatial2 = null;
    public Spatial luna_spatial2A = null;
    public Spatial luna_spatial2B = null;
    public Spatial tierra_spatial3 = null;
    public Spatial luna_spatial3 = null;
    public Spatial tierra_spatial4 = null;
    public Spatial luna_spatial4 = null;
    public Spatial tierra_spatial5 = null;
    
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Node padre_cubo = new Node("padre_cubo");
        Box b = new Box(1, 1, 1);
        Geometry tierra_geom = new Geometry("tierra_geom", b);
        Geometry luna_geom = new Geometry("luna_geom", b);
        Geometry tierra_geom2 = new Geometry("tierra_geom2", b);
        Geometry tierra_geom3 = new Geometry("tierra_geom3", b);
        Geometry tierra_geom4 = new Geometry("tierra_geom4", b);
        Geometry tierra_geom5 = new Geometry("tierra_geom5", b);
        
        
        

        Material mat_blue = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat_blue.setColor("Color", ColorRGBA.Blue);
        Material mat_gray = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat_gray.setColor("Color", ColorRGBA.Gray);
        
        tierra_geom.setMaterial(mat_blue);
        luna_geom.setMaterial(mat_gray);
        
        tierra_geom2.setMaterial(mat_blue);
        
        tierra_geom3.setMaterial(mat_blue);
        
        tierra_geom4.setMaterial(mat_blue);
        
        tierra_geom5.setMaterial(mat_blue);
        
        padre_cubo.attachChild(tierra_geom);
        padre_cubo.attachChild(luna_geom);
        
        padre_cubo.attachChild(tierra_geom2);
        padre_cubo.attachChild(tierra_geom3);
        padre_cubo.attachChild(tierra_geom4);
        padre_cubo.attachChild(tierra_geom5);
        
        
        luna_geom.move(6, 0, 0);
        luna_geom.scale(0.5f);
        
        tierra_geom.move(3,-1,0);
        
        tierra_geom2.move(7,-1,17);
        tierra_geom3.move(10,-1,12);
        tierra_geom4.move(7,-1,4);
        tierra_geom5.move(4,-1,5);
               
        rootNode.attachChild(padre_cubo);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
        if(spatial_var == null){
            spatial_var = rootNode.getChild("padre_cubo");
            tierra_spatial = rootNode.getChild("tierra_geom");
            luna_spatial = rootNode.getChild("luna_geom");
            tierra_spatial2 = rootNode.getChild("tierra_geom2");
            tierra_spatial3 = rootNode.getChild("tierra_geom3");
            tierra_spatial4 = rootNode.getChild("tierra_geom4");
            tierra_spatial5 = rootNode.getChild("tierra_geom5");
            
        }
        
        spatial_var.rotate(0, tpf/4, 0);
        tierra_spatial.rotate(0, -(tpf*2), 0);
        tierra_spatial2.rotate(0, -(tpf*2), 0);
        tierra_spatial3.rotate(0, -(tpf*2), 0);
        tierra_spatial4.rotate(0, -(tpf*2), 0);
        tierra_spatial5.rotate(0, -(tpf*2), 0);
        luna_spatial.rotate(0, tpf, 0);
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
