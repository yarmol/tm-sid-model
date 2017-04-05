/**
* Geographic Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED8A0340-content.html">Geographic Place ABE</a> 
* A group of entities that are used to define a geographic location and  
* enable it to be marked it on a map or given an address. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_business_entity ;

/**
* A piece of land with defined legal boundaries.This is an example of a  
* concrete Geographic Location entity.Synonyms / Aliases:&nbsp;&nbsp;&nb 
* sp;&nbsp;Land Parcel 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicLocation" href="_3E3F0EC000E93C9976AE02B8-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicLocation</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace" href="_3E3F0EC000E93C86C868025A-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public  class Property extends GeographicLocation,GeographicPlace,Place {



/**  
* Field landUseType
*/
protected List<LandUseType> landUseType ;




/**  
* Field lotNr
* A number assigned to a Property lot that is used to identify it. 

*/
protected String lotNr ;




/**  
* Field landUse
* A series of operations on land, carried out by humans, with the intent 

* ion to obtain products and/or benefits through using land resources. [ 

* Land Use Database]</br> 

*/
protected String landUse ;




/**  
* Field landCover
* The vegetation (natural or planted) or man made constructions (buildin 

* gs, etc.) which occur on the earth surface. Water, ice, bare rock, san 

* d and similar surfaces also count as land cover. [Land Use Database]</ 

* br> 

*/
protected String landCover ;




/**  
* Field elevation
* The height above sea level, in the indicated units 

*/
protected String elevation ;




/**  
* Field name
* The property name, if it exists. 

*/
protected String name ;




/**  
* Field urbanPropertyAddress
*/
protected List<UrbanPropertyAddress> urbanPropertyAddress ;


}