p a c k a g e   c o m . b a i d u . c i m o b i . j a v a b e a n ;  
  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 / *  
   *   }T�Nb e a n  
   *   * /  
 p u b l i c   c l a s s   C o m m a n d D e l i v e r y   i m p l e m e n t s   j a v a . i o . S e r i a l i z a b l e {  
 	  
         p r i v a t e   S t r i n g   a c t i o n ;     / / }T�N�v�R\O 
         p r i v a t e   S t r i n g   i d ;             / /  
         p r i v a t e   S t r i n g   a n d r o i d V e r s i o n ;   / /  
         p r i v a t e   S t r i n g   m o b i l e T y p e ;           / /  
         p r i v a t e   b o o l e a n   i s A l l ;                     / /    
         p r i v a t e   A r r a y L i s t < S t r i n g >   b r o w s e r s ;   / /  
         p r i v a t e   S t r i n g   u r l ;  
         p r i v a t e   S t r i n g   a l i a s ;  
         p r i v a t e   S t r i n g   i p ;  
         p r i v a t e   S t r i n g   g r o u p ;  
         p r i v a t e   S t r i n g   s e q u e n c e ;  
                  
         p u b l i c   S t r i n g   g e t S e q u e n c e ( )   {  
 	 	 r e t u r n   s e q u e n c e ;  
 	 }  
 	 p u b l i c   v o i d   s e t S e q u e n c e ( S t r i n g   s e q u e n c e )   {  
 	 	 t h i s . s e q u e n c e   =   s e q u e n c e ;  
 	 }  
 	 p u b l i c   S t r i n g   g e t G r o u p ( )   {  
 	 	 r e t u r n   g r o u p ;  
 	 }  
 	 p u b l i c   v o i d   s e t G r o u p ( S t r i n g   g r o u p )   {  
 	 	 t h i s . g r o u p   =   g r o u p ;  
 	 }  
 	 p u b l i c   S t r i n g   g e t I p ( )   {  
 	 	 r e t u r n   i p ;  
 	 }  
 	 p u b l i c   v o i d   s e t I p ( S t r i n g   i p )   {  
 	 	 t h i s . i p   =   i p ;  
 	 }  
  
 	 p u b l i c   S t r i n g   g e t A l i a s ( )   {  
 	 	 r e t u r n   a l i a s ;  
 	 }  
 	 p u b l i c   v o i d   s e t A l i a s ( S t r i n g   a l i a s )   {  
 	 	 t h i s . a l i a s   =   a l i a s ;  
 	 }  
 	  
 	 p u b l i c   S t r i n g   g e t U r l ( )   {  
 	 	 r e t u r n   u r l ;  
 	 }  
 	 p u b l i c   v o i d   s e t U r l ( S t r i n g   u r l )   {  
 	 	 t h i s . u r l   =   u r l ;  
 	 }  
  
 	 p r i v a t e   H a s h M a p < S t r i n g , S t r i n g >   a t t a c h ;       / /  
          
 	 p u b l i c   S t r i n g   g e t A c t i o n ( )   {  
 	 	 r e t u r n   a c t i o n ;  
 	 }  
 	 p u b l i c   v o i d   s e t A c t i o n ( S t r i n g   a c t i o n )   {  
 	 	 t h i s . a c t i o n   =   a c t i o n ;  
 	 }  
 	  
 	 p u b l i c   S t r i n g   g e t I d ( )   {  
 	 	 r e t u r n   i d ;  
 	 }  
 	 p u b l i c   v o i d   s e t I d ( S t r i n g   i d )   {  
 	 	 t h i s . i d   =   i d ;  
 	 }  
 	  
 	 p u b l i c   S t r i n g   g e t A n d r o i d V e r s i o n ( )   {  
 	 	 r e t u r n   a n d r o i d V e r s i o n ;  
 	 }  
 	 p u b l i c   v o i d   s e t A n d r o i d V e r s i o n ( S t r i n g   a n d r o i d V e r s i o n )   {  
 	 	 t h i s . a n d r o i d V e r s i o n   =   a n d r o i d V e r s i o n ;  
 	 }  
 	  
 	 p u b l i c   S t r i n g   g e t M o b i l e T y p e ( )   {  
 	 	 r e t u r n   m o b i l e T y p e ;  
 	 }  
 	 p u b l i c   v o i d   s e t M o b i l e T y p e ( S t r i n g   m o b i l e T y p e )   {  
 	 	 t h i s . m o b i l e T y p e   =   m o b i l e T y p e ;  
 	 }  
 	  
 	 p u b l i c   b o o l e a n   g e t I s A l l ( )   {  
 	 	 r e t u r n   i s A l l ;  
 	 }  
 	 p u b l i c   v o i d   s e t I s A l l ( b o o l e a n   i s A l l )   {  
 	 	 t h i s . i s A l l   =   i s A l l ;  
 	 }  
 	  
 	 p u b l i c   A r r a y L i s t < S t r i n g >   g e t B r o w s e r s ( )   {  
 	 	 r e t u r n   b r o w s e r s ;  
 	 }  
 	 p u b l i c   v o i d   s e t B r o w s e r s ( A r r a y L i s t < S t r i n g >   b r o w s e r s )   {  
 	 	 t h i s . b r o w s e r s   =   b r o w s e r s ;  
 	 }  
 	  
 	 p u b l i c   H a s h M a p < S t r i n g ,   S t r i n g >   g e t A t t a c h ( )   {  
 	 	 r e t u r n   a t t a c h ;  
 	 }  
 	 p u b l i c   v o i d   s e t A t t a c h ( H a s h M a p < S t r i n g ,   S t r i n g >   a t t a c h )   {  
 	 	 t h i s . a t t a c h   =   a t t a c h ;  
 	 }  
 }  
 