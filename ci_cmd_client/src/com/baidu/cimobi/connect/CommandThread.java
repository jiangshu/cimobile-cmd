p a c k a g e   c o m . b a i d u . c i m o b i . c o n n e c t ;  
  
 i m p o r t   j a v a . i o . B u f f e r e d R e a d e r ;  
 i m p o r t   j a v a . i o . I n p u t S t r e a m R e a d e r ;  
 i m p o r t   j a v a . i o . O b j e c t I n p u t S t r e a m ;  
 i m p o r t   j a v a . i o . O b j e c t O u t p u t S t r e a m ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . n e t . C o n n e c t E x c e p t i o n ;  
 i m p o r t   j a v a . n e t . I n e t S o c k e t A d d r e s s ;  
 i m p o r t   j a v a . n e t . S o c k e t ;  
 i m p o r t   j a v a . n e t . S o c k e t A d d r e s s ;  
 i m p o r t   j a v a . n e t . S o c k e t T i m e o u t E x c e p t i o n ;  
 i m p o r t   j a v a . n e t . U n k n o w n H o s t E x c e p t i o n ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
  
 i m p o r t   c o m . b a i d u . c i m o b i . j a v a b e a n . C o m m a n d D e l i v e r y ;  
 i m p o r t   c o m . b a i d u . c i m o b i . j a v a b e a n . I n f o T y p e ;  
  
 / *  
   *   @ a u t h : j i a n g s h u g u a n g  
   *    O�}T�N�vs o c k e t  
   *   * /  
 p u b l i c   c l a s s   C o m m a n d T h r e a d {  
  
 	 S t r i n g   c o n n e t I n f o   =   " " ;  
 	 S o c k e t   s o c k e t ;  
 	 P r i n t W r i t e r   o u t ;  
 	 B u f f e r e d R e a d e r   i n ;  
 	 O b j e c t I n p u t S t r e a m   o I n ;  
 	 O b j e c t O u t p u t S t r e a m   o O u t ;  
 	 S t r i n g   i p ;  
 	 I n f o T y p e   s t a t u s ;  
 	 i n t   p o r t ;  
 	 i n t   r e C o n n e t C o u n t   =   0 ;  
 	 C o m m a n d D e l i v e r y   c o m m a n d D e l i v e r y ;  
 	  
 	 p u b l i c   C o m m a n d T h r e a d ( S t r i n g   i p , S t r i n g   p o r t , C o m m a n d D e l i v e r y   c o m m a n d D e l i v e r y ) { 	 	  
 	 	 t h i s . i p   =   i p ;  
 	 	 t h i s . p o r t   =   I n t e g e r . p a r s e I n t ( p o r t )   ;  
                 t h i s . c o m m a n d D e l i v e r y   =   c o m m a n d D e l i v e r y ;  
 	 }  
 	  
 	 p r i v a t e   c l a s s   C o n n n e t T h r e a d   e x t e n d s   T h r e a d {  
 	 	 p u b l i c   v o i d   r u n ( ) {  
 	 	 	 t r y {  
 	 	 	 	 s o c k e t   =   n e w   S o c k e t ( ) ;  
 	 	 	 	 S o c k e t A d d r e s s   r e m o t e A d d r   =   n e w   I n e t S o c k e t A d d r e s s ( i p , p o r t ) ;  
 	 	 	 	 s o c k e t . c o n n e c t ( r e m o t e A d d r , 2 0 0 0 ) ;  
 	 	 	 	 o O u t   =   n e w   O b j e c t O u t p u t S t r e a m ( s o c k e t . g e t O u t p u t S t r e a m ( ) ) ;  
 	 	 	 	  
 	 	 	 	 / / c�[c l i e n t :N�S�}T�N 
 	 	 	 	 I n f o T y p e   i n f o T y p e   =   n e w   I n f o T y p e ( ) ;  
 	 	 	 	 i n f o T y p e . s e t T y p e ( " c o m m a n d " ) ;  
 	 	 	 	 o O u t . w r i t e O b j e c t ( i n f o T y p e ) ;  
 	 	 	 	 s l e e p ( 5 0 0 ) ;  
 	 	 	 	 / / c�[wQSO�vc o m m a n d  
 	 	 	 	 o O u t . w r i t e O b j e c t ( c o m m a n d D e l i v e r y ) ; 	 	 	 	  
 	 	 	 	 o I n   =   n e w   O b j e c t I n p u t S t r e a m ( s o c k e t . g e t I n p u t S t r e a m ( ) ) ; 	 	 	 	  
 	 	 	 	 w h i l e ( t r u e ) {  
 	 	 	 	 	 s t a t u s   =   ( I n f o T y p e ) o I n . r e a d O b j e c t ( ) ;  
 	 	 	 	 	 i f ( n u l l   ! =   s t a t u s ) {  
 	 	 	 	 	 	 S y s t e m . o u t . p r i n t l n ( s t a t u s . g e t T y p e ( ) ) ;  
 	 	 	 	 	 	 i f ( n u l l   ! =   o O u t ) {  
 	 	 	 	 	 	 	 o O u t . c l o s e ( ) ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 i f ( n u l l   ! =   o I n ) {  
 	 	 	 	 	 	 	 o I n . c l o s e ( ) ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 i f ( n u l l   ! =   s o c k e t ) {  
 	 	 	 	 	 	 	 s o c k e t . c l o s e ( ) ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 b r e a k ;  
 	 	 	 	 	 }  
 	 	 	 	 }  
 	 	 	   } c a t c h ( U n k n o w n H o s t E x c e p t i o n   e ) {  
 	 	 	 	   S y s t e m . o u t . p r i n t l n ( " a r g u m e n t   e r r o r ! " ) ;  
 / / 	 	 	 	   S y s t e m . o u t . p r i n t l n ( " ܏z;N:gNX[(W" ) ;  
 	 	 	   } c a t c h ( C o n n e c t E x c e p t i o n   e ) {  
 	 	 	 	   S y s t e m . o u t . p r i n t l n ( " c o n n e c t   e r r o r ! " ) ;  
 / / 	 	 	 	   S y s t e m . o u t . p r i n t l n ( " �z�SNX[(W" ) ;  
 	 	 	   } c a t c h ( S o c k e t T i m e o u t E x c e p t i o n   e ) {  
 	 	 	 	   S y s t e m . o u t . p r i n t l n ( " c o n n n e t   t i m e   o u t " ) ;  
 / / 	 	 	 	   S y s t e m . o u t . p r i n t l n ( " ޏ�c���e" ) ;  
 / / 	 	 	 	   r e C o n n e c t ( t h i s ) ;  
 	 	 	   } c a t c h ( E x c e p t i o n   e )   { 	  
 	 	 	 	   S y s t e m . o u t . p r i n t l n ( " c o n n e c t   e r r o r ! " ) ;  
 / / 	 	 	 	   r e C o n n e c t ( t h i s ) ;  
 	 	 	   }  
 	 	 }  
 	 }  
 	  
 	       / *  
 	         *   _8^͑ޏ 
 	         *   * / 	  
 	       p u b l i c   v o i d   r e C o n n e c t ( T h r e a d   t h r e a d ) {  
 	 	       i f ( r e C o n n e t C o u n t > 5 ) {  
 	 	 	       r e t u r n ;  
 	 	       }  
 	 	       S y s t e m . o u t . p r i n t l n ( " �[7b�zޏ�c�]-N�e\ n " ) ;  
 	 	       S y s t e m . o u t . p r i n t l n ( " ck(W͑ޏ. . . . \ n " ) ;  
 	 	       t r y {  
 	 	 	       t h r e a d . s l e e p ( 2 0 0 0 ) ;  
 	 	 	       i f ( n u l l   ! =   s o c k e t ) {  
 	 	 	 	 	 s o c k e t . c l o s e ( ) ;  
 	 	 	       }  
 	 	 	       ( n e w   C o n n n e t T h r e a d ( ) ) . s t a r t ( ) ;  
 	 	 	        
 	 	       } c a t c h ( E x c e p t i o n   e ) {  
 	 	 	       S y s t e m . o u t . p r i n t l n ( " ͑�eޏ�c1Y%�" ) ;  
 	 	       }  
 	 	       r e C o n n e t C o u n t + + ;  
 	       }  
 	        
 	       / *  
 	         *   /T�R�~z 
 	         *   * /  
 	     p u b l i c   v o i d   s t a r t ( ) {  
 	 	     ( n e w   C o n n n e t T h r e a d ( ) ) . s t a r t ( ) ;  
 	     }  
 	      
 	     / *  
 	       *   ���S�r`�Oo` 
 	       *   * /  
 / / 	     p u b l i c   S t r i n g   g e t S t a t u s ( ) {  
 / / 	 	     r e t u r n   s t a t u s ;  
 / / 	     }  
 	        
 }  
 