/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defencesystem;

/**
 *
 * @author User
 */
 interface DefenceObserver {
    public void getMsgMain(String msg);
    public void update(int position);
    public void areaClearLabel(boolean clear);
    public void updateButtons();
    
    
}
