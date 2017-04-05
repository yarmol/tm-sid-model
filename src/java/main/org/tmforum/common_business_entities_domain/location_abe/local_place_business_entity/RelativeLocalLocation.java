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
* A LocalLocation that is defined using coordinates that are relative to 
*  another LocalLocation.The coordinate units are defined in the LocalCo 
* ordinateSystem. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Local Place ABE::LocalContinuativeLocation" href="_3E3F0EC000E93EF112E50080-content.html">SID Models::Common Business Entities Domain::Location ABE::Local Place ABE::LocalContinuativeLocation</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Local Place ABE::LocalLocation" href="_3E3F0EC000E93C9E984E02B6-content.html">SID Models::Common Business Entities Domain::Location ABE::Local Place ABE::LocalLocation</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Local Place ABE::LocalPlace" href="_3E3F0EC000E93C86C86100DE-content.html">SID Models::Common Business Entities Domain::Location ABE::Local Place ABE::LocalPlace</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public  class RelativeLocalLocation extends LocalContinuativeLocation,LocalLocation,LocalPlace,Place {



/**  
* Field referenceLocation
*/
protected LocalContinuativeLocation referenceLocation ;




/**  
* Field dX
* The x Cartesian coordinate relative to the referenceLocation. 

*/
protected String dX ;




/**  
* Field dY
* The y Cartesian coordinate relative to the referenceLocation. 

*/
protected String dY ;




/**  
* Field dZ
* The z Cartesian coordinate relative to the referenceLocation.</br></br 

* >Notes: required for 3D representations</br></br> 

*/
protected String dZ ;


}