# Android Responsive Design Lessons

## Summary
    This is a collection of various lessons learned in implementing a responsive design strategy
    into an Android Application.
    
### Step 1
    In step one we defined our guidelines which mainly established a few of our design principles:
        1. Applying a defined Margin/padding for out component space sides:
            -  LEFT/START, TOP, RIGHT/END, BOTTOM
            -  Value is defined in our `dimens.xml`[Dimens](values/dimens.xml) file
            -  `<dimen name="app_padding_or_margin">15dp</dimen>`
            -  This will allow to to easily modify this value in one place, if necessary once we 
            |  start dealing with multiple devices with different screen DPI's
            
### Step 2
    In step two we further expanded upon our original example. We removed some of the repetition
    by moving it into styles, *but learned that the guidelines orientation must be defined inline
    or the style explorer will not display it correctly* 
    
    Additionally we added a Vertical Linear Layout to our contraint layout, and added some buttons to it.
    **important**
    Note how the linear layouts' height & width are set to `0dp`. The extent of the layouts bounding
    box (e.g. it's position and dimensions) is actually defined via the layout constraints: 
        (Start|End|Top|Bottom)
        | with accompanying modifiers: 
        | - Horizontal (toStartOf, toEndOf)
        | - Vertical (toBottomOf,toTopOf)
    
    While each button also has a: 
        | height of `android:layout_height=0dp` 
        | a width of `match_parent` 
        | and weight of `android:layout_weight=1`
        
### STEP 3
    We aim to show how we can size and position various items throughout our UI using our constrainsts
    to guarantee that sizing and positioning is consistent with any number of items on our display.
    
    We added a TabLayout with some tabs to allow us to switch between the different fragments. 
    
    Our original fragment, and now the added centered fragment. Since we didnt' want to use a ViewPager
    we implemented our tabs with a frame layout. And added a listener for tab button updates.