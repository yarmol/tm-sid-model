/**
* Geographic Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED8A0340-content.html">Geographic Place ABE</a> 
* A group of entities that are used to define a geographic location and  
* enable it to be marked it on a map or given an address. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_business_entity ;

/**
* A convenience class that allows us to easily refer to Places important 
*  to the Service Provider. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace" href="_3E3F0EC000E93C86C868025A-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public  class GeographicSite extends GeographicPlace,Place {



/**  
* Field geographicSiteRole
*/
protected List<GeographicSiteRole> geographicSiteRole ;




/**  
* Field datumPoint
*/
protected GeographicLocation datumPoint ;




/**  
* Field geographicLocation
*/
protected GeographicLocation geographicLocation ;




/**  
* Field localPlace
*/
protected List<LocalPlace> localPlace ;




/**  
* Field name
* The name that the site is known by. 

*/
protected String name ;




/**  
* Field code
* A code that may be used for some addressing schemes e.g. [ANSI T1.253- 

* 1999]. 

*/
protected String code ;




/**  
* Field status
* The condition of the GeographicSite, such as active, inactive, planned 

* . 

*/
protected String status ;


}