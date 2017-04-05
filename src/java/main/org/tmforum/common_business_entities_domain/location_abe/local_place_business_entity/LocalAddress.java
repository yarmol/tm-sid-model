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
* A structured textual way of describing an internal location. It is an  
* abstract modeling concept that provides a linking point to other parts 
*  of the SID model. It holds attributes common to all Local Address sub 
* classes. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Local Place ABE::LocalPlace" href="_3E3F0EC000E93C86C86100DE-content.html">SID Models::Common Business Entities Domain::Location ABE::Local Place ABE::LocalPlace</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public abstract class LocalAddress extends LocalPlace,Place {



/**  
* Field compoundLocalAddress
*/
protected CompoundLocalAddress compoundLocalAddress ;




/**  
* Field localLocation
*/
protected List<LocalLocation> localLocation ;




/**  
* Field type
* The type of LocalAddress.</br></br>Notes:e.g RACK, SUITE 

*/
protected String type ;




/**  
* Field positionNr
* The position within the type.</br></br>Notes: often a number with a su 

* ffix, e.g. “5B” 

*/
protected String positionNr ;




/**  
* Field fullAddress
* A denormalised string showing the type and position numbers up the hie 

* rarchy with separator characters.</br></br>Notes:</br></br>provide if  

* required for performance purposes.</br>e.g. SUITE 5 /  RACK 7B / SUBRA 

* CK 2 / CARD 3 </br> 

*/
protected String fullAddress ;




/**  
* Field abstractGeographicAddress
*/
protected AbstractGeographicAddress abstractGeographicAddress ;


}