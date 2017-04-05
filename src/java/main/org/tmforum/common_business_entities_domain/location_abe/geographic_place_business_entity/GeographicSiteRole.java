/**
* Geographic Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED8A0340-content.html">Geographic Place ABE</a> 
* A group of entities that are used to define a geographic location and  
* enable it to be marked it on a map or given an address. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_business_entity ;

/**
* The part played by a Site in a given context with any characteristics, 
*  such as expected pattern of behavior, attributes, and/or associations 
*  that it entails. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicSite" href="_3E3F0EC000E93C86C7BA01BA-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicSite</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace" href="_3E3F0EC000E93C86C868025A-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public  class GeographicSiteRole extends GeographicSite,GeographicPlace,Place {



/**  
* Field geographicSite
*/
protected GeographicSite geographicSite ;




/**  
* Field type
* The name of the role e.g. asset location. 

*/
protected String type ;


}