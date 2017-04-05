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
* How the value of the metric is determined, examples are ratio, formula 
* , algorithm, external call (web service).This entity is may be further 
*  developed to support all determination methods.  It may also be furth 
* er defined and subclassed in the future. 
 @since SID_R16.5
*/ 

public  class MetricDefinitionDeterminationMethod  {



/**  
* Field metricDefMeasure
*/
protected MetricDefMeasure metricDefMeasure ;




/**  
* Field metricDefinitionMethodComponent
*/
protected List<MetricDefinitionMethodArgument> metricDefinitionMethodComponent ;




/**  
* Field type
* Indicates whether the determination method is a ratio, formula, averag 

* e, min, max, median, std dev, and so forth. 

*/
protected String type ;




/**  
* Field exceptionAction
* Action to take when one or more of the related MetricDefinitionMethodA 

* rgument cause indeterminate results, such as a denominator of 0 in a r 

* atio or a missing value for a  MetricDefinitionMethodArgument. 

*/
protected String exceptionAction ;




/**  
* Field proseFormula
* A prose expression of formula, may not be as precise as the XLS formul 

* a or some XLS-like formula. 

*/
protected String proseFormula ;




/**  
* Field xLSForumula
* A precise XLS-compatible formula using XLS named ranges (from XLS Name 

*  field). 

*/
protected String xLSForumula ;




/**  
* Field description
* A narrative that explains in detail what the MetricDefinitionDetermina 

* tionMethod is. 

*/
protected String description ;




/**  
* Field derivationFormula
* A rule or principle represented in symbols, numbers, or letters, often 

*  in the form of an equation used to derive the value of a metric.</br> 

* </br> 

*/
protected String derivationFormula ;




/**  
* Field metric
*/
protected MetricMeasure metric ;




/**  
* Field validFor
* The period for which the MetricDefinitionDeterminationMethod is valid. 

*/
protected TimePeriod validFor ;


}