/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;


import java.util.List;
/**
 * {@link ${NAME}} exposes a list of ${ITEM_CLASS} to a
 * {@link android.support.v7.widget.RecyclerView}
 * In order to use this adapter in your code make sure that Recyclerview is added to your build.gradle file
 * and complete TODO's.
 */
public class ${NAME} extends RecyclerView.Adapter<${NAME}.${NAME}ViewHolder> {

    private List<${ITEM_CLASS}> mItems;

    /*
     * An on-click handler that we've defined to make it easy for an Activity to interface with
     * our RecyclerView
     */
    private final ${NAME}OnClickHandler mClickHandler;

    /**
     * The interface that receives onClick messages.
    * Implement this interface in your activity
    * and pass in that activity as ${NAME}.${NAME}OnClickHandler to ${NAME} constructor.
     */
    public interface ${NAME}OnClickHandler {
        void onClick(int clickedItemPosition);
    }

    
    /**
     * Creates a ${NAME}.
     *
     * @param clickHandler The on-click handler for this adapter. This single handler is called
     *                     when an item is clicked.
     */
    public ${NAME}(${NAME}OnClickHandler clickHandler) {
        mClickHandler = clickHandler;
    }

  
    /**
     * Cache of the children views for a  list item.
     */
    public class ${NAME}ViewHolder extends RecyclerView.ViewHolder implements OnClickListener {
        // TODO Initiate views that you will bind data on

        public ${NAME}ViewHolder(View itemView) {
            super(itemView);
            // TODO get a reference to view for data binding. Use itemView.findViewById()

            itemView.setOnClickListener(this);
        }

        /**
         * This gets called by the child views during a click.
         *
         * @param v The View that was clicked
         */
        @Override
        public void onClick(View v) {
            int adapterPosition = getAdapterPosition();
            mClickHandler.onClick(adapterPosition);
        }
    }

    /**
     * This gets called when each new ViewHolder is created. This happens when the RecyclerView
     * is laid out. Enough ViewHolders will be created to fill the screen and allow for scrolling.
     *
     * @param viewGroup The ViewGroup that these ViewHolders are contained within.
     * @param viewType  If your RecyclerView has more than one type of item (which ours doesn't) you
     *                  can use this viewType integer to provide a different layout. See
     *                  {@link android.support.v7.widget.RecyclerView.Adapter#getItemViewType(int)}
     *                  for more details.
     * @return A new ${NAME}ViewHolder that holds the View for each list item
     */
    @Override
    public ${NAME}ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.${ITEM_LAYOUT_FILE};
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        return new ${NAME}ViewHolder(view);
    }

    /**
     * OnBindViewHolder is called by the RecyclerView to display the data at the specified
     * position. In this method, we update the contents of the ViewHolder to display the weather
     * details for this particular position, using the "position" argument that is conveniently
     * passed into us.
     *
     * @param viewHolder The ViewHolder which should be updated to represent the
     *                                  contents of the item at the given position in the data set.
     * @param position                  The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(${NAME}ViewHolder viewHolder, int position) {
        ${ITEM_CLASS} dataToBind = getItemByPosition(position);
// TODO Bind dataToBind to children of viewHolder
    }

    /**
     * This method simply returns the number of items to display. It is used behind the scenes
     * to help layout our Views and for animations.
     *
     * @return The number of items available in our data set
     */
    @Override
    public int getItemCount() {
        if (null == mItems) return 0;
        return mItems.size();
    }

    /**
     * This method is used to set the data on a ${NAME} if we've already
     * created one. This is handy when we get new data from the web but don't want to create a
     * new ${NAME} to display it.
     *
     * @param data The new  data to be displayed.
     */
    public void setData(List<${ITEM_CLASS}> data) {
        mItems = data;
        notifyDataSetChanged();
    }

    /**
     * Returns the item of the data set at the specified position
    */
public ${ITEM_CLASS} getItemByPosition(int position) {
return mItems.get(position);
} 
}