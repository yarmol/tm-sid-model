/**
* Local Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED9503DC-content.html">Local Place ABE</a> 
* A set of entities that determine where things are in relation to a loc 
* al coordinate system. It provides a linking point to other parts of th 
* e SID model. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.local_place_business_entity ;

/**
* The relative position of something measured independently and not in r 
* elation to something else. 
 @since SID_R16.5
*/ 

public  class AbsoluteLocalOrientation  {



/**  
* Field theta
* The angle between the z axis and the Z axis 

*/
protected String theta ;




/**  
* Field pi
* The angle between the x axis and the N axis. 

*/
protected String pi ;




/**  
* Field psi
*  The angle between the N axis and the X axis.</br> 

*/
protected String psi ;


}