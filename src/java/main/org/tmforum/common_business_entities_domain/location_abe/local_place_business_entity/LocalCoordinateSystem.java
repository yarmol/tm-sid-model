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
* A local coordinate system allows us to position things in a small area 
*  where the curvature of the Earth can be ignored. It would commonly be 
*  used to define placement in an Exchange building (Central Office)It i 
* s an abstract entity that holds common attributes and relationships. F 
* or continuative locations, the Units will usually be unity for a given 
*  measure (e.g. 1 metre). For grid coordinate systems, the unit will of 
* ten be a non unity measure (e.g. 600mm) 
 @since SID_R16.5
*/ 

public abstract class LocalCoordinateSystem  {



/**  
* Field localOrientation
* The orientation of the LocalCoordinateSystem, such as directional (nor 

* th, south) or facing (front, back,side), angle of rotation from the ax 

* es of the LocalCoordinateSystem. 

*/
protected AbsoluteLocalOrientation localOrientation ;




/**  
* Field xUnits
* The unit for a number in the X direction in a local location.</br></br 

* >Notes: units could be metres, feet, inches … 

*/
protected String xUnits ;




/**  
* Field yUnits
* The unit for a number in the Y direction in a local location.</br></br 

* >Notes: units could be metres, feet, inches … 

*/
protected String yUnits ;




/**  
* Field zUnits
* The unit for a number in the Z direction in a local location.</br></br 

* >Notes: units could be metres, feet, inches … 

*/
protected String zUnits ;




/**  
* Field localDatumPoint
*/
protected GeographicLocation localDatumPoint ;


}