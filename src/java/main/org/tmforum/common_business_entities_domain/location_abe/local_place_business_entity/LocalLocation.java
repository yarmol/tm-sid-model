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
* A defined place defined by a local coordinate system. It is an abstrac 
* t modeling concept that provides a linking point to other parts of the 
*  SID model. It holds attributes common to all Local Location subclasse 
* s. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Local Place ABE::LocalPlace" href="_3E3F0EC000E93C86C86100DE-content.html">SID Models::Common Business Entities Domain::Location ABE::Local Place ABE::LocalPlace</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public abstract class LocalLocation extends LocalPlace,Place {



/**  
* Field localAddress
*/
protected LocalAddress localAddress ;




/**  
* Field orientation
* The angle of rotation from the axes of the local coordinate system. 

*/
protected AbsoluteLocalOrientation orientation ;




/**  
* Field to
*/
protected List<LocalLocation> to ;




/**  
* Field from
*/
protected List<LocalLocation> from ;




/**  
* Field physicalResourceSpec
*/
protected PhysicalResourceSpec physicalResourceSpec ;


}