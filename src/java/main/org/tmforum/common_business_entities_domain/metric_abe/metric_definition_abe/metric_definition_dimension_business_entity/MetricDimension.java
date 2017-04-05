/**
* Metric Definition Dimension ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.jO.e.p0CU.vE.eO.tV.b.kUFYE.u.d.g-content.html">Metric Definition Dimension ABE</a> 
* The Metric Definition Dimension ABE contains all entities describing t 
* he Dimension in a Metric context. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_abe.metric_definition_dimension_business_entity ;

/**
* A metric dimension designates a method of organizing individual metric 
* s into common sets, related by the value of the named dimension.  An e 
* xample would be a metric for revenue--individual instance values of re 
* venue could be organized in the dimension of geography (Region 1 Reven 
* ues, Region 2 Revenues, etc.), or by Product (Wireless Revenue, Wire-l 
* ine Revenue, Broadband Revenue, Advertising Revenue, etc.).  The chara 
* cteristic term when discussing Dimension is "by", as in "Revenue, by P 
* roduct" or "Revenue, by Region". 
 @since SID_R16.5
*/ 

public  class MetricDimension  {



/**  
* Field name
* A word, term, or phrase by which a MetricDeimension is known and disti 

* nguished from other MetricDimensions. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the MetricDimension is. 

*/
protected String description ;




/**  
* Field metricDimensionValue
*/
protected List<MetricDimensionValue> metricDimensionValue ;




/**  
* Field metricDefinitionDimensionUse
*/
protected MetricDefinitionDimensionUse metricDefinitionDimensionUse ;




/**  
* Field dataType
* A kind of value represented by the MetricDimensionValue associated ent 

* ity, such as numeric, text, and so forth. 

*/
protected String dataType ;


}