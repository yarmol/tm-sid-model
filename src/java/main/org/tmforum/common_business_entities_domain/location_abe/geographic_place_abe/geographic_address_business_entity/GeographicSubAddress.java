/**
* Geographic Address ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CF18102EF-content.html">Geographic Address ABE</a> 
* A group of entities used to represent the geographic address of a loca 
* tion. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_abe.geographic_address_business_entity ;

/**
* A Geographic Sub Address "contains information in addition to that gen 
* erally found in a standard single address [ANZLIC-STREET]It is an abst 
* ract modeling concept that provides a linking point to other parts of  
* the SID model.It holds attributes common to all Geographic Sub Address 
*  subclasses. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::AbstractGeographicAddress" href="_3E3F0EC000E93EEEA0260066-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::AbstractGeographicAddress</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public abstract class GeographicSubAddress extends AbstractGeographicAddress,GeographicPlace,Place {



/**  
* Field geographicAddress
*/
protected GeographicAddress geographicAddress ;


}