/**
* Metric Definition Measure ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_LG5.m0A8.rE.eOYVLP.tPBF.v2.g-content.html">Metric Definition Measure ABE</a> 
* The MetricDefMeasure specifies a measure of a specific aspect of an en 
* tity and is the main part of a MetricDefinition.The Metric Definition  
* Measure ABE contains all entities describing the MetricDefMeasure such 
*  as the related threshold, notification and consequence. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_measure_business_entity ;

/**
* The MetricValueType specifies the different possible type of values su 
* ch as Int, String... 
 @since SID_R16.5
*/ 

public  enum MetricValueType  {



/**  
* Field DOUBLE
* Double type 

*/
 DOUBLE ,




/**  
* Field FLOAT
* Float type 

*/
 FLOAT ,




/**  
* Field INT
* Int type 

*/
 INT ,




/**  
* Field STRING
* String type 

*/
 STRING ,


}