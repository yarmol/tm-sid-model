/**
* Geographic Address ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CF18102EF-content.html">Geographic Address ABE</a> 
* A group of entities used to represent the geographic address of a loca 
* tion. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_abe.geographic_address_business_entity ;

/**
* An abstract (not a material) address from which others, such as Geogrp 
* hicAddress, inherit. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public abstract class AbstractGeographicAddress extends GeographicPlace,Place {



/**  
* Field localAddress
*/
protected List<LocalAddress> localAddress ;




/**  
* Field contactMedium
*/
protected List<ContactMedium> contactMedium ;


}