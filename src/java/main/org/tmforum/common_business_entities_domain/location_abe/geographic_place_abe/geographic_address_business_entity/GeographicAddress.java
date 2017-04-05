/**
* Geographic Address ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CF18102EF-content.html">Geographic Address ABE</a> 
* A group of entities used to represent the geographic address of a loca 
* tion. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_abe.geographic_address_business_entity ;

/**
* A structured textual way of describing how to find a Geographic Locati 
* on. It is usually composed of an ordered list of Geographic Location n 
* ames based on context specific rulesIt is an abstract modeling concept 
*  that provides a linking point to other parts of the SID model.It hold 
* s attributes common to all Geographic Address subclasses. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::AbstractGeographicAddress" href="_3E3F0EC000E93EEEA0260066-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::AbstractGeographicAddress</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public abstract class GeographicAddress extends AbstractGeographicAddress,GeographicPlace,Place {



/**  
* Field geographicSubAddress
*/
protected List<GeographicSubAddress> geographicSubAddress ;




/**  
* Field logicalAddress
*/
protected List<LogicalAddress> logicalAddress ;




/**  
* Field geographicLocation
*/
protected List<GeographicLocation> geographicLocation ;




/**  
* Field country
* The country that the address is in. 

*/
protected Country country ;




/**  
* Field stateOrProvince
* The state or province that the address is in.</br></br>Synonyms / Alia 

* ses:&nbsp;&nbsp;&nbsp;&nbsp;province, territory 

*/
protected String stateOrProvince ;




/**  
* Field streetSegment
*/
protected StreetSegment streetSegment ;


}