/**
* Geographic Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED8A0340-content.html">Geographic Place ABE</a> 
* A group of entities that are used to define a geographic location and  
* enable it to be marked it on a map or given an address. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_business_entity ;

/**
* A geographic loaction, typically a building, used to house the inside  
* plant equipment of potentially several telephone exchanges, each servi 
* ng a certain geographical exchange area. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Property" href="_3E3F0EC000E93C96A9BC03DC-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Property</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicLocation" href="_3E3F0EC000E93C9976AE02B8-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicLocation</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace" href="_3E3F0EC000E93C86C868025A-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public  class ExchangeLocation extends Property,GeographicLocation,GeographicPlace,Place {



/**  
* Field exchangeServiceArea
*/
protected ExchangeServiceArea exchangeServiceArea ;




/**  
* Field datum
* A single piece of information, such as a fact, statistic, or code, for 

*  a ExchangeLocation.  

*/
protected String datum ;


}