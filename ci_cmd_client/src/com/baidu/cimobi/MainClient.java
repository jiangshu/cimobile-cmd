p a c k a g e   c o m . b a i d u . c i m o b i ;  
  
 i m p o r t   c o m . b a i d u . c i m o b i . c o n n e c t . C o m m a n d T h r e a d ;  
 i m p o r t   c o m . b a i d u . c i m o b i . C o m m a n d . C o m m a n d M o d e l ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
  
 / *  
   *   a u t h : j i a n g s h u g u a n g  
   *   }T�N��eQ�zeQ�S 
   *   * /  
  
 p u b l i c   c l a s s   M a i n C l i e n t   {  
 	 / *  
 	   *   @ i p = 1 7 2 . 2 2 . 1 8 4 . 9 0                                                   g�RhVi p  
 	   *   p o r t = 3 2 0 4                                                                                             g�RhV�v�z�S 
 	   *   a c t i o n = o p e n B r o w s e r                 }T�N�v{|�W 
 	   *   b r o w s e r = u c @ n a t i v e @ c h r o m e     }T�N\O(u�vOmȉhVƖT 
 	   *   a n d r o i d V e r s i o n = 4 . 2 . 2                                 �|�~Hr,g 
 	   *   m o b i l e T y p e = h t c                         m o b i l e {|�W�S�W�S 
 	   *   i d = d j i g _ j i e g j                           m o b i l e �vI D  
 	   *   i s A l l = t r u e                                 /f&T�[@b	g�n��ag�N�vm o b i l e gbL�}T�N 
 	   *   u r l                                               Omȉ�[�^Sb _�vu r l      
 	   *   a l i a s = " j s g "                               :ghV+RT 
 	   *   g r o u p = " g e "                                 R�~   
 	   *   * /  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g s [ ] )   {  
 	 	  
 	         S t r i n g   i p   =   " 1 2 7 . 0 . 0 . 1 " ;  
 	         S t r i n g   p o r t   =   " 8 0 1 1 " ;  
 	         S t r i n g   a c t i o n   =   n u l l ;  
 	         S t r i n g   i d     =   n u l l ;  
 	         S t r i n g   a n d r o i d V e r s i o n   =   n u l l ;  
 	         S t r i n g   m o b i l e T y p e   =   n u l l ;  
 	         B o o l e a n   i s A l l   =   f a l s e ;  
 	         S t r i n g   u r l   =   n u l l ;  
 	         S t r i n g   a l i a s   =   n u l l ;  
 	         S t r i n g   g r o u p   =   n u l l ;  
 	         S t r i n g   s e q u e n c e   =   n u l l ;  
 	         A r r a y L i s t < S t r i n g >   b r o w s e r s   =   n e w   A r r a y L i s t < S t r i n g > ( ) ;  
 	         H a s h M a p < S t r i n g , S t r i n g >   a t t a c h   =   n e w   H a s h M a p < S t r i n g , S t r i n g > ( ) ;  
 	 	  
 	 	 S t r i n g   a r g u m e n t I t e m   =   " " ;  
 	 	 S t r i n g   a r g u m e n t A r r [ ] ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ; i < a r g s . l e n g t h ; i + + ) {  
 	 	 	 a r g u m e n t I t e m   =   a r g s [ i ] ;  
 	 	 	 a r g u m e n t A r r   =   a r g u m e n t I t e m . s p l i t ( " = " , 2 ) ;  
 	 	 	 i f ( a r g u m e n t A r r [ 0 ] . e q u a l s ( " i p " ) ) {  
 	 	 	 	 i p   =   a r g u m e n t A r r [ 1 ] ;  
 	 	 	 } e l s e   i f ( a r g u m e n t A r r [ 0 ] . e q u a l s ( " p o r t " ) ) {  
 	 	 	 	 p o r t   =   a r g u m e n t A r r [ 1 ] ;  
 	 	 	 } e l s e   i f ( a r g u m e n t A r r [ 0 ] . e q u a l s ( " a c t i o n " ) ) {  
 	 	 	 	 a c t i o n   =   a r g u m e n t A r r [ 1 ] ;  
 	 	 	 } e l s e   i f ( a r g u m e n t A r r [ 0 ] . e q u a l s ( " b r o w s e r " ) ) {  
 	 	 	 	 a r g u m e n t I t e m   =   a r g u m e n t A r r [ 1 ] ;  
 	 	 	 	 a r g u m e n t A r r   =   a r g u m e n t I t e m . s p l i t ( " @ " ) ;  
 	 	 	 	 f o r ( i n t   j = 0 ;   j < a r g u m e n t A r r . l e n g t h ;   j + + ) {  
 	 	 	 	 	 b r o w s e r s . a d d ( a r g u m e n t A r r [ j ] . t o L o w e r C a s e ( ) ) ;  
 	 	 	 	 }  
 	 	 	 } e l s e   i f ( a r g u m e n t A r r [ 0 ] . e q u a l s ( " a n d r o i d V e r s i o n " ) ) { 	 	  
 	 	 	 	 a n d r o i d V e r s i o n   =   a r g u m e n t A r r [ 1 ] ;  
 	 	 	 } e l s e   i f ( a r g u m e n t A r r [ 0 ] . e q u a l s ( " m o b i l e T y p e " ) ) {  
 	 	 	 	 m o b i l e T y p e   =   a r g u m e n t A r r [ 1 ] ;  
 	 	 	 } e l s e   i f ( a r g u m e n t A r r [ 0 ] . e q u a l s ( " i d " ) ) {  
 	 	 	 	 i d   =   a r g u m e n t A r r [ 1 ] ;  
 	 	 	 } e l s e   i f ( a r g u m e n t A r r [ 0 ] . e q u a l s ( " g r o u p " ) ) {  
 	 	 	 	 g r o u p   =   a r g u m e n t A r r [ 1 ] ;  
 	 	 	 } e l s e   i f ( a r g u m e n t A r r [ 0 ] . e q u a l s ( " u r l " ) ) {  
 	 	 	 	 u r l   =   a r g u m e n t A r r [ 1 ] ;  
 	 	 	 } e l s e   i f ( a r g u m e n t A r r [ 0 ] . e q u a l s ( " i s A l l " ) ) {  
 	 	 	 	 i f ( a r g u m e n t A r r [ 1 ] . e q u a l s ( " t r u e " ) ) {  
 	 	 	 	 	 i s A l l   =   t r u e ;  
 	 	 	 	 } e l s e {  
 	 	 	 	 	 i s A l l     =   f a l s e ;  
 	 	 	 	 }  
 	 	 	 } e l s e   i f ( a r g u m e n t A r r [ 0 ] . e q u a l s ( " a l i a s " ) ) {  
 	 	 	 	 a l i a s   =   a r g u m e n t A r r [ 1 ] ;  
 	 	 	 } e l s e   i f ( a r g u m e n t A r r [ 0 ] . e q u a l s ( " s e q u e n c e " ) ) {  
 	 	 	 	 s e q u e n c e   =   a r g u m e n t A r r [ 1 ] ;  
 	 	 	 } e l s e {  
 	 	 	 	 a t t a c h . p u t ( a r g u m e n t A r r [ 0 ] ,   a r g u m e n t A r r [ 1 ] ) ;  
 	 	 	 } 	 	 	  
 	 	 }  
  
 	 	 C o m m a n d M o d e l   c o m m a n d M o d e l   =   n e w   C o m m a n d M o d e l ( a c t i o n , i d , a n d r o i d V e r s i o n ,  
 	 	 	 	 m o b i l e T y p e , i s A l l , b r o w s e r s , u r l , a t t a c h , a l i a s , g r o u p , s e q u e n c e ) ;  
 	 	 C o m m a n d T h r e a d   c o m m a n d T h r e a d   =   n e w   C o m m a n d T h r e a d ( i p , p o r t , c o m m a n d M o d e l . g e t C o m m a n d ( ) ) ;  
 	 	 c o m m a n d T h r e a d . s t a r t ( ) ;      
  
         }  
 }  
 