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
* Arguments needed for the calculation of the metrric definition such as 
*  numerator and denominator.This entity imay be enhanced when MetricDef 
* initionDeterminationMethod is enhanced.  An argument could be a Metric 
* Definition or a raw counter. 
 @since SID_R16.5
*/ 

public  class MetricDefinitionMethodArgument  {



/**  
* Field metricDefinitionDeterminationMethod
*/
protected List<MetricDefinitionDeterminationMethod> metricDefinitionDeterminationMethod ;




/**  
* Field metricDefinition
*/
protected List<MetricDefinition> metricDefinition ;




/**  
* Field sequence
* The order in which an argument appears in an expression. 

*/
protected Integer sequence ;




/**  
* Field operator
* A mathematical symbol, term, or other entity that describes an operati 

* on. 

*/
protected String operator ;




/**  
* Field name
* A word, term, or phrase by which a MetricDefinitionMethodArgument is k 

* nown and distinguished from other MetricDefinitionMethodArguments.  Th 

* is could be used as the name of the raw counter or some other non-Metr 

* icDefinition argument.</br> 

*/
protected String name ;




/**  
* Field delimiter
* A character used to specify the boundary between separate arguments. 

*/
protected String delimiter ;




/**  
* Field scalarValue
* A quantity that can assume any of a set of values. 

*/
protected UnlimitedNatural scalarValue ;


}