/**
* Performance Collection ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_RVF.yEI.a.rE.eC.pLZ.eR.zU7N.l.g-content.html">Performance Collection ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_monitoring_abe.performance_collection_business_entity ;

/**
* Sampling rate of the collection  of perfomance indicators.Supported va 
* lues are : 1mn, 5mn, 15mn, 30mn, 1h, 24h, not applicable. Note that li 
* tterals cannot start by a digit, so they are prefixed by a letter.  
 @since SID_R16.5
*/ 

public  enum CollectionResolution  {



/**  
* Field G_15MN
*/
 G_15MN ,




/**  
* Field G_1H
*/
 G_1H ,




/**  
* Field G_1MN
*/
 G_1MN ,




/**  
* Field G_24H
*/
 G_24H ,




/**  
* Field G_30MN
*/
 G_30MN ,




/**  
* Field G_5MN
*/
 G_5MN ,


}