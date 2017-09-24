/**
 * Created by adavi on 24.09.2017.
 */
$(document).ready(function() {

    var clickedflag = false;

    $('div.form li div.sub').hide();

    $('div.form li').mouseover(function(){
        if(!clickedflag)
            $(this).find('div.sub').slideDown(300);
    });

    $('div.form li').mouseleave(function(){
        if(!clickedflag)
            $(this).find('div.sub').slideUp(300);
    });

    $('div.form li').click(function() {
        clickedflag = true;
        $(this).find('div.sub').slideDown(300);
        $(this).siblings().find('div.sub').slideUp(300);
    });



});