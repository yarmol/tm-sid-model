/**
* Geographic Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED8A0340-content.html">Geographic Place ABE</a> 
* A group of entities that are used to define a geographic location and  
* enable it to be marked it on a map or given an address. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_business_entity ;

/**
* This is a generic entity, used to represent areas defined on maps that 
*  relate to areas of settlement.This is an example of a concrete Geogra 
* phic Location entity. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicLocation" href="_3E3F0EC000E93C9976AE02B8-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicLocation</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace" href="_3E3F0EC000E93C86C868025A-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public  class GeographicArea extends GeographicLocation,GeographicPlace,Place {



/**  
* Field country
*/
protected Country country ;




/**  
* Field state
*/
protected GeographicState state ;




/**  
* Field name
* The defined name of the GeographicArea. 

*/
protected String name ;




/**  
* Field code
* Used if a standard code set has been defined for the GeographicArea ty 

* pe.</br></br>Notes: see [ANSI T.253] for US codes 

*/
protected String code ;




/**  
* Field type
* The type of GeorgraphicArea, such as SUBURB, LOCALITY, CITY, TOWN or V 

* ILLAGE or BOROUGH or HAMLET, and so forth. 

*/
protected String type ;




/**  
* Field marketSegment
*/
protected List<MarketSegment> marketSegment ;




/**  
* Field marketSegmentCharacteristic
*/
protected List<MarketSegmentCharacteristic> marketSegmentCharacteristic ;




/**  
* Field partyDemographic
*/
protected List<PartyDemographic> partyDemographic ;




/**  
* Field partyProfileType
*/
protected List<PartyProfileType> partyProfileType ;




/**  
* Field marketStatistic
*/
protected List<MarketStatistic> marketStatistic ;




/**  
* Field productOfferingPrice
*/
protected List<ProductOfferingPrice> productOfferingPrice ;




/**  
* Field distributionChannel
*/
protected List<DistributionChannel> distributionChannel ;




/**  
* Field productCatalogSpecification
*/
protected List<ProductCatalogSpecification> productCatalogSpecification ;


}