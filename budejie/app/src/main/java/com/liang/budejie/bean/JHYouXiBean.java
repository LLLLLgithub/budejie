package com.liang.budejie.bean;

import java.util.List;

/**
 * Created by qf on 2016/11/3.
 */
public class JHYouXiBean {

    /**
     * count : 1000
     * np : 1.477967275E9
     */

    private InfoBean info;
    /**
     * status : 2
     * comment : 34
     * tags : [{"id":1,"name":"搞笑"},{"id":60,"name":"吐槽"},{"id":164,"name":"游戏"},{"id":335,"name":"男神"},{"id":3176,"name":"冷知识"}]
     * bookmark : 6
     * text : 厉害了我的哥！老外是这样玩爆竹的！！
     * up : 126
     * share_url : http://a.f.budejie.com/share/21825163.html?wx.qq.com
     * down : 18
     * forward : 6
     * u : {"header":["http://wimg.spriteapp.cn/profile/large/2016/08/17/57b4535f343bf_mini.jpg","http://dimg.spriteapp.cn/profile/large/2016/08/17/57b4535f343bf_mini.jpg"],"uid":"18263501","is_vip":false,"is_v":false,"room_url":"","room_name":"","room_role":"","room_icon":"","name":"UFO卡特"}
     * passtime : 2016-11-03 13:43:36
     * video : {"playfcount":110,"height":360,"width":640,"video":["http://wvideo.spriteapp.cn/video/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpd.mp4","http://dvideo.spriteapp.cn/video/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpd.mp4"],"download":["http://wvideo.spriteapp.cn/video/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpc.mp4","http://dvideo.spriteapp.cn/video/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpc.mp4"],"duration":312,"playcount":6223,"thumbnail":["http://wimg.spriteapp.cn/picture/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpd.jpg","http://dimg.spriteapp.cn/picture/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpd.jpg"],"thumbnail_small":["http://wimg.spriteapp.cn/crop/150x150/picture/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpd.jpg","http://dimg.spriteapp.cn/crop/150x150/picture/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpd.jpg"]}
     * type : video
     * id : 21825163
     */

    private List<ListBean> list;

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class InfoBean {
        private int count;
        private double np;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public double getNp() {
            return np;
        }

        public void setNp(double np) {
            this.np = np;
        }
    }

    public static class ListBean {
        private int status;
        private String comment;
        private String bookmark;
        private String text;
        private String up;
        private String share_url;
        private int down;
        private int forward;
        /**
         * header : ["http://wimg.spriteapp.cn/profile/large/2016/08/17/57b4535f343bf_mini.jpg","http://dimg.spriteapp.cn/profile/large/2016/08/17/57b4535f343bf_mini.jpg"]
         * uid : 18263501
         * is_vip : false
         * is_v : false
         * room_url :
         * room_name :
         * room_role :
         * room_icon :
         * name : UFO卡特
         */

        private UBean u;
        private String passtime;
        /**
         * playfcount : 110
         * height : 360
         * width : 640
         * video : ["http://wvideo.spriteapp.cn/video/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpd.mp4","http://dvideo.spriteapp.cn/video/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpd.mp4"]
         * download : ["http://wvideo.spriteapp.cn/video/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpc.mp4","http://dvideo.spriteapp.cn/video/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpc.mp4"]
         * duration : 312
         * playcount : 6223
         * thumbnail : ["http://wimg.spriteapp.cn/picture/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpd.jpg","http://dimg.spriteapp.cn/picture/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpd.jpg"]
         * thumbnail_small : ["http://wimg.spriteapp.cn/crop/150x150/picture/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpd.jpg","http://dimg.spriteapp.cn/crop/150x150/picture/2016/1103/48b44880-a188-11e6-86df-d4ae5296039d_wpd.jpg"]
         */

        private VideoBean video;
        private String type;
        private String id;
        /**
         * id : 1
         * name : 搞笑
         */

        private List<TagsBean> tags;
        /**
         * voicetime : 0
         * status : 0
         * cmt_type : text
         * precid : 0
         * content : 喜欢黄渤的有多少？
         * like_count : 31
         * u : {"header":["http://qzapp.qlogo.cn/qzapp/100336987/F8D086834C05635A613D6296FD7AECCD/100","http://qzapp.qlogo.cn/qzapp/100336987/F8D086834C05635A613D6296FD7AECCD/100"],"sex":"m","uid":"19461236","is_vip":false,"name":"courage_11"}
         * preuid : 0
         * passtime : 2016-11-02 02:55:21
         * voiceuri :
         * id : 67694851
         */

        private List<TopCommentsBean> top_comments;
        /**
         * medium : []
         * big : ["http://wimg.spriteapp.cn/ugc/2016/11/01/581869686a88b_1.jpg","http://dimg.spriteapp.cn/ugc/2016/11/01/581869686a88b_1.jpg"]
         * download_url : ["http://wimg.spriteapp.cn/ugc/2016/11/01/581869686a88b_d.jpg","http://dimg.spriteapp.cn/ugc/2016/11/01/581869686a88b_d.jpg","http://wimg.spriteapp.cn/ugc/2016/11/01/581869686a88b.jpg","http://dimg.spriteapp.cn/ugc/2016/11/01/581869686a88b.jpg"]
         * height : 1651
         * width : 864
         * small : []
         * thumbnail_small : ["http://wimg.spriteapp.cn/crop/150x150/ugc/2016/11/01/581869686a88b.jpg","http://dimg.spriteapp.cn/crop/150x150/ugc/2016/11/01/581869686a88b.jpg"]
         */

        private ImageBean image;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getBookmark() {
            return bookmark;
        }

        public void setBookmark(String bookmark) {
            this.bookmark = bookmark;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public int getDown() {
            return down;
        }

        public void setDown(int down) {
            this.down = down;
        }

        public int getForward() {
            return forward;
        }

        public void setForward(int forward) {
            this.forward = forward;
        }

        public UBean getU() {
            return u;
        }

        public void setU(UBean u) {
            this.u = u;
        }

        public String getPasstime() {
            return passtime;
        }

        public void setPasstime(String passtime) {
            this.passtime = passtime;
        }

        public VideoBean getVideo() {
            return video;
        }

        public void setVideo(VideoBean video) {
            this.video = video;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public List<TopCommentsBean> getTop_comments() {
            return top_comments;
        }

        public void setTop_comments(List<TopCommentsBean> top_comments) {
            this.top_comments = top_comments;
        }

        public ImageBean getImage() {
            return image;
        }

        public void setImage(ImageBean image) {
            this.image = image;
        }

        public static class UBean {
            private String uid;
            private boolean is_vip;
            private boolean is_v;
            private String room_url;
            private String room_name;
            private String room_role;
            private String room_icon;
            private String name;
            private List<String> header;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public boolean isIs_vip() {
                return is_vip;
            }

            public void setIs_vip(boolean is_vip) {
                this.is_vip = is_vip;
            }

            public boolean isIs_v() {
                return is_v;
            }

            public void setIs_v(boolean is_v) {
                this.is_v = is_v;
            }

            public String getRoom_url() {
                return room_url;
            }

            public void setRoom_url(String room_url) {
                this.room_url = room_url;
            }

            public String getRoom_name() {
                return room_name;
            }

            public void setRoom_name(String room_name) {
                this.room_name = room_name;
            }

            public String getRoom_role() {
                return room_role;
            }

            public void setRoom_role(String room_role) {
                this.room_role = room_role;
            }

            public String getRoom_icon() {
                return room_icon;
            }

            public void setRoom_icon(String room_icon) {
                this.room_icon = room_icon;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<String> getHeader() {
                return header;
            }

            public void setHeader(List<String> header) {
                this.header = header;
            }
        }

        public static class VideoBean {
            private int playfcount;
            private int height;
            private int width;
            private int duration;
            private int playcount;
            private List<String> video;
            private List<String> download;
            private List<String> thumbnail;
            private List<String> thumbnail_small;

            public int getPlayfcount() {
                return playfcount;
            }

            public void setPlayfcount(int playfcount) {
                this.playfcount = playfcount;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getPlaycount() {
                return playcount;
            }

            public void setPlaycount(int playcount) {
                this.playcount = playcount;
            }

            public List<String> getVideo() {
                return video;
            }

            public void setVideo(List<String> video) {
                this.video = video;
            }

            public List<String> getDownload() {
                return download;
            }

            public void setDownload(List<String> download) {
                this.download = download;
            }

            public List<String> getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(List<String> thumbnail) {
                this.thumbnail = thumbnail;
            }

            public List<String> getThumbnail_small() {
                return thumbnail_small;
            }

            public void setThumbnail_small(List<String> thumbnail_small) {
                this.thumbnail_small = thumbnail_small;
            }
        }

        public static class TagsBean {
            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class TopCommentsBean {
            private int voicetime;
            private int status;
            private String cmt_type;
            private int precid;
            private String content;
            private int like_count;
            /**
             * header : ["http://qzapp.qlogo.cn/qzapp/100336987/F8D086834C05635A613D6296FD7AECCD/100","http://qzapp.qlogo.cn/qzapp/100336987/F8D086834C05635A613D6296FD7AECCD/100"]
             * sex : m
             * uid : 19461236
             * is_vip : false
             * name : courage_11
             */

            private UBean u;
            private int preuid;
            private String passtime;
            private String voiceuri;
            private int id;

            public int getVoicetime() {
                return voicetime;
            }

            public void setVoicetime(int voicetime) {
                this.voicetime = voicetime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getCmt_type() {
                return cmt_type;
            }

            public void setCmt_type(String cmt_type) {
                this.cmt_type = cmt_type;
            }

            public int getPrecid() {
                return precid;
            }

            public void setPrecid(int precid) {
                this.precid = precid;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getLike_count() {
                return like_count;
            }

            public void setLike_count(int like_count) {
                this.like_count = like_count;
            }

            public UBean getU() {
                return u;
            }

            public void setU(UBean u) {
                this.u = u;
            }

            public int getPreuid() {
                return preuid;
            }

            public void setPreuid(int preuid) {
                this.preuid = preuid;
            }

            public String getPasstime() {
                return passtime;
            }

            public void setPasstime(String passtime) {
                this.passtime = passtime;
            }

            public String getVoiceuri() {
                return voiceuri;
            }

            public void setVoiceuri(String voiceuri) {
                this.voiceuri = voiceuri;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public static class UBean {
                private String sex;
                private String uid;
                private boolean is_vip;
                private String name;
                private List<String> header;

                public String getSex() {
                    return sex;
                }

                public void setSex(String sex) {
                    this.sex = sex;
                }

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public boolean isIs_vip() {
                    return is_vip;
                }

                public void setIs_vip(boolean is_vip) {
                    this.is_vip = is_vip;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<String> getHeader() {
                    return header;
                }

                public void setHeader(List<String> header) {
                    this.header = header;
                }
            }
        }

        public static class ImageBean {
            private int height;
            private int width;
            private List<?> medium;
            private List<String> big;
            private List<String> download_url;
            private List<?> small;
            private List<String> thumbnail_small;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<?> getMedium() {
                return medium;
            }

            public void setMedium(List<?> medium) {
                this.medium = medium;
            }

            public List<String> getBig() {
                return big;
            }

            public void setBig(List<String> big) {
                this.big = big;
            }

            public List<String> getDownload_url() {
                return download_url;
            }

            public void setDownload_url(List<String> download_url) {
                this.download_url = download_url;
            }

            public List<?> getSmall() {
                return small;
            }

            public void setSmall(List<?> small) {
                this.small = small;
            }

            public List<String> getThumbnail_small() {
                return thumbnail_small;
            }

            public void setThumbnail_small(List<String> thumbnail_small) {
                this.thumbnail_small = thumbnail_small;
            }
        }
    }
}
