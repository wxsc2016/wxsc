 $("#myCarousel").carousel('cycle');
 //  兼容性判断
 var isTouch = ('ontouchstart' in window);
 if (isTouch) {
     $(".carousel").on('touchstart', function(e) {
         var that = $(this);
         var touch = e.originalEvent.changedTouches[0];
         //  console.log(e.originalEvent);
         var startX = touch.pageX;
         var startY = touch.pageY;
         $(document).on('touchmove', function(e) {
             e.preventDefault();
             touch = e.originalEvent.touches[0] || e.originalEvent.changedTouches[0];
             var endX = touch.pageX - startX;
             var endY = touch.pageY - startY;
             if (Math.abs(endY) < Math.abs(endX)) {
                 if (endX > 10) {
                     $(this).off('touchmove');
                     that.carousel('prev');
                 } else if (endX < -10) {
                     $(this).off('touchmove');
                     that.carousel('next');
                 }
                 return false;
             }
         });
     });
     $(document).on('touchend', function() {
         $(this).off('touchmove');
     });
 }
 $(function() {
     $('.b-reduce').click(function() {
         //  console.log('aa');
         var oldval = parseInt($('.b-txt').val());
         if (oldval > 0) {
             oldval--;
             $('.b-txt').val(oldval);
             $('.goBuyCar').attr('data-num', parseInt(oldval));
         }
     })
     $('.b-add').click(function() {
         //  console.log($('.b-txt').val().toString());
         var oldval = parseInt($('.b-txt').val());
         oldval++;
         $('.b-txt').val(oldval);
         $('.goBuyCar').attr('data-num', parseInt(oldval));
     })
     $('.nav-tabs ul li:eq(0)').click(function() {
         $('.tab-pane:eq(1)').css('display', 'none');
         $('.tab-pane:eq(0)').css('display', 'block').addClass('active').siblings().removeClass('active');
         $(this).addClass('cur').siblings().removeClass('cur');
     })
     $('.nav-tabs ul li:eq(1)').click(function() {
         $('.tab-pane:eq(0)').css('display', 'none');
         $('.tab-pane:eq(1)').css('display', 'block').addClass('active').siblings().removeClass('active');
         $(this).addClass('cur').siblings().removeClass('cur');
     })
 })