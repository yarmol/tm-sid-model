/**
* Geographic Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED8A0340-content.html">Geographic Place ABE</a> 
* A group of entities that are used to define a geographic location and  
* enable it to be marked it on a map or given an address. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_business_entity ;

/**
* A defined place on or near the earth's surface. It is an abstract mode 
* ling concept that provides a linking point to other parts of the SID m 
* odel.It holds attributes common to all Geographic Location subclasses. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace" href="_3E3F0EC000E93C86C868025A-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public abstract class GeographicLocation extends GeographicPlace,Place {



/**  
* Field linearReferenceSystem
*/
protected LinearReferenceSystem linearReferenceSystem ;




/**  
* Field geographicLocationType
*/
protected GeographicLocationType geographicLocationType ;




/**  
* Field geographicLocationName
*/
protected List<GeographicLocationName> geographicLocationName ;




/**  
* Field geographicSite
*/
protected List<GeographicSite> geographicSite ;




/**  
* Field geographicSite1
*/
protected GeographicSite geographicSite1 ;




/**  
* Field geographicAddress
*/
protected GeographicAddress geographicAddress ;




/**  
* Field geometry
* The two dimensional graphical representation of the Location allowing  

* it to be displayed on a map and to be used for spatial calculations.</ 

* br></br>Notes: Since Geometry is abstract, the attribute will actually 

*  be one of the concrete subclasses 

*/
protected Geometry geometry ;




/**  
* Field accuracy
* The accuracy of the GeographicLocation.  For example, this GPS measure 

* ment is accurate to +-20 metres. This attribute allows us to determine 

*  when two points close to each other could be the same point. Refer "[ 

* OGIS] Abstract Specification, Topic 9: Quality" for details of this co 

* mplex subject.</br></br>Notes: This should be provided if the geometry 

*  attribute is not null. 

*/
protected String accuracy ;




/**  
* Field to
*/
protected List<GeographicLocation> to ;




/**  
* Field from
*/
protected List<GeographicLocation> from ;




/**  
* Field localCoordinateSystem
*/
protected List<LocalCoordinateSystem> localCoordinateSystem ;




/**  
* Field standardWorkCalendar
*/
protected List<StandardWorkCalendar> standardWorkCalendar ;


}