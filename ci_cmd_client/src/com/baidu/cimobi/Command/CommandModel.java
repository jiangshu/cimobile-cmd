p a c k a g e   c o m . b a i d u . c i m o b i . C o m m a n d ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
  
  
 i m p o r t   c o m . b a i d u . c i m o b i . j a v a b e a n . C o m m a n d D e l i v e r y ;  
 p u b l i c   c l a s s   C o m m a n d M o d e l   {  
       p r i v a t e   C o m m a n d D e l i v e r y   c o m m a n d D e l i v e r y ;  
  
       p u b l i c   C o m m a n d M o d e l ( S t r i n g   a c t i o n , S t r i n g   i d , S t r i n g   a n d r o i d V e r s i o n ,  
 	 	 	 S t r i n g   m o b i l e T y p e , b o o l e a n   i s A l l , A r r a y L i s t < S t r i n g >   b r o w s e r s ,  
 	 	 	 S t r i n g   u r l , H a s h M a p < S t r i n g , S t r i n g > a t t a c h , S t r i n g   a l i a s , S t r i n g   g r o u p , S t r i n g   s e q u e n c e ) {  
             t h i s . c o m m a n d D e l i v e r y   =   n e w   C o m m a n d D e l i v e r y ( ) ;  
 	     c o m m a n d D e l i v e r y   =   n e w   C o m m a n d D e l i v e r y ( ) ;  
 	     c o m m a n d D e l i v e r y . s e t A n d r o i d V e r s i o n ( a n d r o i d V e r s i o n ) ;  
 	     c o m m a n d D e l i v e r y . s e t A t t a c h ( a t t a c h ) ;  
 	     c o m m a n d D e l i v e r y . s e t B r o w s e r s ( b r o w s e r s ) ;  
 	     c o m m a n d D e l i v e r y . s e t I d ( i d ) ;  
 	     c o m m a n d D e l i v e r y . s e t I s A l l ( i s A l l ) ;  
             c o m m a n d D e l i v e r y . s e t M o b i l e T y p e ( m o b i l e T y p e ) ;  
 	     c o m m a n d D e l i v e r y . s e t A c t i o n ( a c t i o n ) ;  
 	     c o m m a n d D e l i v e r y . s e t U r l ( u r l ) ;  
 	     c o m m a n d D e l i v e r y . s e t A l i a s ( a l i a s ) ;  
 	     c o m m a n d D e l i v e r y . s e t G r o u p ( g r o u p ) ;  
 	     c o m m a n d D e l i v e r y . s e t S e q u e n c e ( s e q u e n c e ) ;  
       }    
        
       p u b l i c   C o m m a n d D e l i v e r y   g e t C o m m a n d ( ) {  
 	       r e t u r n   t h i s . c o m m a n d D e l i v e r y ;  
       }  
 }  
 