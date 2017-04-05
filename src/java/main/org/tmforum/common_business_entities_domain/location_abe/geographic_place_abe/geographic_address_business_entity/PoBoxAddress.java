/**
* Geographic Address ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CF18102EF-content.html">Geographic Address ABE</a> 
* A group of entities used to represent the geographic address of a loca 
* tion. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_abe.geographic_address_business_entity ;

/**
* An optional component of a PostalDeliveryAddress that reprsents a post 
*  office box number. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::PostalDeliveryAddress" href="_3E3F0EC000E93C997CC600D0-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::PostalDeliveryAddress</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::LogicalAddress" href="_3E3F0EC000E93C969B2603D2-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::LogicalAddress</a> @since SID_R16.5
*/ 

public  class PoBoxAddress extends PostalDeliveryAddress,LogicalAddress {



/**  
* Field boxType
* The kind of box number.  For example one at a post office or other loc 

* ation authorized to maintain postal boxes. 

*/
protected String boxType ;




/**  
* Field boxNr
* A number or text that represents a post office box number. 

*/
protected String boxNr ;


}