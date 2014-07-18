(defn cards [s]
  (let [ranks (zipmap "23456789TJQKA" (range 13))
        suits (zipmap "DHCS" [:diamond :heart :club :spade])
        suit (suits (first s))
        rank (ranks (last s))]
    {:suit suit, :rank rank}))

(= {:suit :diamond :rank 10} (cards "DQ"))

(= {:suit :heart :rank 3} (cards "H5"))

(= {:suit :club :rank 12} (cards "CA"))

(= (range 13) (map (comp :rank cards str)
                   '[S2 S3 S4 S5 S6 S7
                     S8 S9 ST SJ SQ SK SA]))
